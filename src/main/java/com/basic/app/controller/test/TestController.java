package com.basic.app.controller.test;

import com.basic.app.acl.auth.domain.User;
import com.basic.app.acl.auth.repository.UserRepository;
import com.basic.app.acl.security.UserDetailsServiceImpl;
import com.basic.app.acl.auth.service.UserService;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    ObjectFactory<HttpSession> httpSessionFactory;
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;
    @Autowired
    UserDetailsServiceImpl userDetailsService;


    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/restricted")
    @ResponseBody
    public String restricted() {
        return "You found the secret lair!";
    }



    public String requiredComponents() {


        HttpSession session44 = httpSessionFactory.getObject();

        SecurityContext securityContext = SecurityContextHolder.getContext();
        System.out.println(securityContext.getAuthentication().getName());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username1 = auth.getName(); //get logged in username


        UserDetails userDetails = userDetailsService.loadUserByUsername(username1);
        User user = userRepository.getUserByUsername(username1);


        return "You found the secret lair!";
    }

    @RequestMapping(value = "/api2/loadServiceReqChartData", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public HashMap<String, Object> loadServiceReqChartData2() {
        ArrayList<Object> al = new ArrayList<Object>();
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("en", "Greetings!");
        al.add(map1);
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("hi", "Namaste!");
        al.add(map2);

        //
        HashMap<String, Object> finalMap = new HashMap<>();
        finalMap.put("data", al);
        return finalMap;
    }


    public String wwwQuery(){

        // 1
        // https://stackoverflow.com/questions/27623475/jpa-entitymanager-run-native-sql-query-to-get-everything-out-from-a-table
        // List<Item> itemList = (List<Item>)em.createNativeQuery("SELECT * FROM item WHERE itemcode='" + itemCode + "'", Item.class).getResultList();


        // 2 *****
        // https://examples.javacodegeeks.com/enterprise-java/jpa/jpa-native-sql-queries-example/
        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("jcg-JPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        List<>?> list = em.createNativeQuery("Select employee_id, employee_name from employee", Employee.class).getResultList();
        System.out.println(list);

        em.getTransaction().commit();*/



        // 3
        // https://www.firstfewlines.com/post/spring-boot-jpa-run-native-sql-query/
//        /*
//        @Autowired
//        private EntityManagerFactory entityManagerFactory;
//
//        public Double getDayPrice(String scrip, Date prdate) {
//            EntityManager session = entityManagerFactory.createEntityManager();
//            try {
//                Double daypr = (Double)session.createNativeQuery("Select lastpr FROM StockPrice WHERE scrip=:scrip and prdate = :prdate")
//                        .setParameter("scrip", scrip)
//                        .setParameter("prdate", prdate)
//                        .getSingleResult();
//
//                return daypr;
//            }
//            catch (NoResultException e){
//                return null;
//            }
//            finally {
//                if(session.isOpen()) session.close();
//            }
//        }*/


        // 4
//https://thorben-janssen.com/jpa-features-easier-spring-data-jpa/
//        TypedQuery<Author> q = em.createQuery("SELECT a FROM Author a WHERE a.firstName = :fname", Author.class);
//        q.setParameter("fname", "Thorben");
//        List<Author> authors = q.getResultList();


        // 5
        // https://stackoverflow.com/questions/3449719/how-to-run-an-aggregate-function-like-sum-on-two-columns-in-jpa-and-display-thei
       /* final Query sumQuery = entityManager
                .createQuery("SELECT SUM(p.price), SUM(p.sale) FROM Product p WHERE p.item=:ITEM AND ....");
        sumQuery.setParameter("ITEM","t1");

        final Object result= sumQuery.getSingleResult(); // Return an array Object with 2 elements, 1st is sum(price) and 2nd is sum(sale).

//If you have multiple rows;
        final Query sumQuery = entityManager
                .createQuery("SELECT SUM(p.price), SUM(p.sale) FROM Product p WHERE p.item in (" + itemlist
                        + ") AND ....");
// Return a list of arrays, where each array correspond to 1 item (row) in resultset.
        final List<IEniqDBEntity> sumEntityList = sumQuery.getResultList();*/

        return null;
    }



    @PreAuthorize("permitAll()")
    @RequestMapping("/ggggg")
    @ResponseBody
    public String home() {
        return "Welcome home!";
    }

    @RequestMapping("/restricted2")
    @ResponseBody
    public String restricted2() {
        return "You found the secret lair!";
    }


    @PreAuthorize("hasAuthority('Admin')")
    @RequestMapping("/restricted3")
    @ResponseBody
    public String restricted3() {
        return "You found the secret lair!";
    }


    @Secured("ROLE_USER")
    @RequestMapping("/securityTest7")
    public String getUsername() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        System.out.println(securityContext.getAuthentication().getName());
        return securityContext.getAuthentication().getName();
    }


    @Secured({ "ROLE_VIEWER", "ROLE_EDITOR" })
    public boolean isValidUsername(String username) {
//        return userRoleRepository.isValidUsername(username);
        return false;
    }

    @RolesAllowed({ "ROLE_VIEWER", "ROLE_EDITOR" })
    public boolean isValidUsername2(String username) {
        return false;
    }

    @PreAuthorize("hasRole('ROLE_VIEWER') or hasRole('ROLE_EDITOR')")
    public boolean isValidUsername3(String username) {
        return false;
    }


//    @PostAuthorize("returnObject.username == authentication.principal.nickName")
    public String loadUserDetail(String username) {
//        return userRoleRepository.loadUserByUserName(username);
        return null;
    }

//    @PreAuthorize("hasRole('USER')")
//    public void create(Contact contact){
//
//    }


    @Autowired
    private EntityManagerFactory entityManagerFactory;
//    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");

    public String getAllUser(){

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jcg-JPA");
//        EntityManager em = emf.createEntityManager();
        EntityManager em = entityManagerFactory.createEntityManager();
        Long nOfUser = 0L;

        try {

            System.out.println("--------------*************************************");

            em.getTransaction().begin();

            List<?> list = em.createNativeQuery("SELECT * FROM AUTH_USER", User.class).getResultList();
            System.out.println(list);

            Query query = em.createQuery(
                    "SELECT e.username FROM User e WHERE e.username = '01779282132'");
            List<?> result = query.getResultList();
            System.out.println(result);

            Query query2 = em.createQuery(
                    "SELECT COUNT(e) FROM User e WHERE e.enabled = true ");
            nOfUser = (Long) query2.getSingleResult();//salary of type long
            System.out.println(nOfUser);

            em.getTransaction().commit();

            System.out.println("--------------*************************************");

        } catch (NoResultException e){
            return null;
        } finally {
            em.close();
        }
        return nOfUser.toString();

    }



}
