package com.thikthak.app.modules.main;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MainEntity {
    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
    public class Schema{
        public String tablename;
    }

    public class Std{
        public boolean disabled;
        public String id;
        public String className;
        public String text;
        public String btnColor;
        public String grpClass;
        public String iiconL;
        public String uiPlacement;
        public String iiconR;
    }

    public class BtnNew{
        public boolean active;
    }

    public class BtnSaveForm{
        public boolean active;
    }

    public class BtnEnterEditMode{
        public boolean active;
    }

    public class BtnDelete{
        public boolean active;
    }

    public class BtnCopyAndNew{
        public boolean active;
    }

    public class StdBtnstatus{
        public BtnNew btnNew;
        public BtnSaveForm btnSaveForm;
        public BtnEnterEditMode btnEnterEditMode;
        public BtnDelete btnDelete;
        public BtnCopyAndNew btnCopyAndNew;
    }

    public class Toolbars{
        public List<Std> std;
        public StdBtnstatus std_btnstatus;
    }

    public class TabBaseBegin{
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("UIStyleType")
        public String uIStyleType;
        @JsonProperty("Active")
        public boolean active;
        public String fielddesc;
        @JsonProperty("CustomClassName")
        public String customClassName;
        @JsonProperty("ObjSequence")
        public String objSequence;
        @JsonProperty("LstSequence")
        public String lstSequence;
    }

    public class BoxBaseBegin{
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("UIStyleType")
        public String uIStyleType;
        public String fielddesc;
        @JsonProperty("ObjSequence")
        public String objSequence;
        @JsonProperty("LstSequence")
        public String lstSequence;
    }

    public class Id{
        public String fielddesc;
        public boolean entityKey;
        public boolean hideOnCreateField;
        public boolean hideOnUpdateField;
        public boolean hideOnViewField;
        public boolean hideOnListField;
    }

    public class Organization{
        public String fielddesc;
        @JsonProperty("ReadOnly")
        public String readOnly;
        @JsonProperty("JavaType")
        public String javaType;
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("Reference")
        public boolean reference;
        @JsonProperty("ReferenceEntityName")
        public String referenceEntityName;
        @JsonProperty("ReferenceEntityKeyFieldName")
        public String referenceEntityKeyFieldName;
        @JsonProperty("RefDropdownOption")
        public boolean refDropdownOption;
        @JsonProperty("ReferenceEntityValidation")
        public boolean referenceEntityValidation;
        @JsonProperty("ReferenceEntityThisFieldName")
        public String referenceEntityThisFieldName;
        @JsonProperty("ReferenceEntityCodeFieldName")
        public String referenceEntityCodeFieldName;
        @JsonProperty("ReferenceEntityDescriptionFieldName")
        public String referenceEntityDescriptionFieldName;
        @JsonProperty("HtmlType")
        public String htmlType;
        @JsonProperty("DecodeReferenceCode")
        public boolean decodeReferenceCode;
        @JsonProperty("DataSource")
        public String dataSource;
        public boolean showReferenceCode;
        @JsonProperty("Restrict3Char")
        public boolean restrict3Char;
        @JsonProperty("PrintAttribute")
        public String printAttribute;
        @JsonProperty("MandatoryInUI")
        public boolean mandatoryInUI;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
        public String defaultval;
    }

    public class OperatingUnit{
        public String fielddesc;
        @JsonProperty("JavaType")
        public String javaType;
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("Reference")
        public boolean reference;
        @JsonProperty("ReferenceEntityName")
        public String referenceEntityName;
        @JsonProperty("ReferenceEntityKeyFieldName")
        public String referenceEntityKeyFieldName;
        @JsonProperty("RefDropdownOption")
        public boolean refDropdownOption;
        @JsonProperty("ReferenceEntityValidation")
        public boolean referenceEntityValidation;
        @JsonProperty("ReferenceEntityThisFieldName")
        public String referenceEntityThisFieldName;
        @JsonProperty("ReferenceEntityCodeFieldName")
        public String referenceEntityCodeFieldName;
        @JsonProperty("ReferenceEntityDescriptionFieldName")
        public String referenceEntityDescriptionFieldName;
        @JsonProperty("HtmlType")
        public String htmlType;
        @JsonProperty("DataSource")
        public String dataSource;
        @JsonProperty("DecodeReferenceCode")
        public boolean decodeReferenceCode;
        public boolean showReferenceCode;
        @JsonProperty("Restrict3Char")
        public boolean restrict3Char;
        @JsonProperty("PrintAttribute")
        public String printAttribute;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
        public String defaultval;
    }

    public class Code{
        public String fielddesc;
        @JsonProperty("ReadOnly")
        public String readOnly;
        @JsonProperty("CapitalCodeAttribute")
        public boolean capitalCodeAttribute;
        @JsonProperty("CharLength")
        public int charLength;
        @JsonProperty("CounterStartForm")
        public int counterStartForm;
        @JsonProperty("UIViewOnly")
        public boolean uIViewOnly;
        @JsonProperty("OnEditOnly")
        public boolean onEditOnly;
        @JsonProperty("PrintAttribute")
        public String printAttribute;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
    }

    public class Name{
        public String fielddesc;
        @JsonProperty("MandatoryInUI")
        public boolean mandatoryInUI;
        @JsonProperty("PrintAttribute")
        public String printAttribute;
        @JsonProperty("HtmlType")
        public String htmlType;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
    }

    public class LongDescription{
        public String fielddesc;
        @JsonProperty("HtmlType")
        public String htmlType;
        public boolean hideOnCreateField;
        public boolean hideOnUpdateField;
        public boolean hideOnViewField;
        public boolean hideOnListField;
        @JsonProperty("PrintAttribute")
        public String printAttribute;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
    }

    public class ShortDescription{
        public String fielddesc;
        @JsonProperty("HtmlType")
        public String htmlType;
        public boolean hideOnCreateField;
        public boolean hideOnUpdateField;
        public boolean hideOnViewField;
        public boolean hideOnListField;
        @JsonProperty("PrintAttribute")
        public String printAttribute;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
    }

    public class SearchDescription{
        public String fielddesc;
        @JsonProperty("HtmlType")
        public String htmlType;
        public boolean hideOnCreateField;
        public boolean hideOnUpdateField;
        public boolean hideOnViewField;
        public boolean hideOnListField;
        @JsonProperty("PrintAttribute")
        public String printAttribute;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
    }

    public class BoxBaseEnd{
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("UIStyleType")
        public String uIStyleType;
        public String fielddesc;
        @JsonProperty("ObjSequence")
        public String objSequence;
        @JsonProperty("LstSequence")
        public String lstSequence;
    }

    public class TabBaseEnd{
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("UIStyleType")
        public String uIStyleType;
        public String fielddesc;
        @JsonProperty("ObjSequence")
        public String objSequence;
        @JsonProperty("LstSequence")
        public String lstSequence;
    }

    public class TabLogInfoBegin{
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("UIStyleType")
        public String uIStyleType;
        public String fielddesc;
        @JsonProperty("CustomClassName")
        public String customClassName;
        @JsonProperty("ObjSequence")
        public String objSequence;
        @JsonProperty("LstSequence")
        public String lstSequence;
    }

    public class BoxLogInfoBegin{
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("UIStyleType")
        public String uIStyleType;
        public String fielddesc;
        @JsonProperty("ObjSequence")
        public String objSequence;
        @JsonProperty("LstSequence")
        public String lstSequence;
    }

    public class CreationDateTime{
        public String fielddesc;
        @JsonProperty("JavaType")
        public String javaType;
        @JsonProperty("SqlType")
        public String sqlType;
        @JsonProperty("ReadOnly")
        public String readOnly;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
    }

    public class CreationUser{
        public String fielddesc;
        @JsonProperty("ReadOnly")
        public String readOnly;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
    }

    public class LastUpdateDateTime{
        public String fielddesc;
        @JsonProperty("JavaType")
        public String javaType;
        @JsonProperty("SqlType")
        public String sqlType;
        @JsonProperty("ReadOnly")
        public String readOnly;
        public boolean hideOnListField;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
    }

    public class LastUpdateUser{
        public String fielddesc;
        @JsonProperty("ReadOnly")
        public String readOnly;
        public boolean hideOnListField;
        @JsonProperty("HTMLSize")
        public String hTMLSize;
        @JsonProperty("ListSize")
        public String listSize;
    }

    public class BoxLogInfoEnd{
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("UIStyleType")
        public String uIStyleType;
        public String fielddesc;
        @JsonProperty("ObjSequence")
        public String objSequence;
        @JsonProperty("LstSequence")
        public String lstSequence;
    }

    public class TabLogInfoEnd{
        @JsonProperty("AttributeType")
        public String attributeType;
        @JsonProperty("UIStyleType")
        public String uIStyleType;
        @JsonProperty("ObjSequence")
        public String objSequence;
        @JsonProperty("LstSequence")
        public String lstSequence;
    }

    public class Attributes{
        public TabBaseBegin tabBaseBegin;
        public BoxBaseBegin boxBaseBegin;
        public Id id;
        public Organization organization;
        public OperatingUnit operatingUnit;
        public Code code;
        public Name name;
        public LongDescription longDescription;
        public ShortDescription shortDescription;
        public SearchDescription searchDescription;
        public BoxBaseEnd boxBaseEnd;
        public TabBaseEnd tabBaseEnd;
        public TabLogInfoBegin tabLogInfoBegin;
        public BoxLogInfoBegin boxLogInfoBegin;
        public CreationDateTime creationDateTime;
        public CreationUser creationUser;
        public LastUpdateDateTime lastUpdateDateTime;
        public LastUpdateUser lastUpdateUser;
        public BoxLogInfoEnd boxLogInfoEnd;
        public TabLogInfoEnd tabLogInfoEnd;
    }

    public class ObjectStructure{
        public TabBaseBegin tabBaseBegin;
        public BoxBaseBegin boxBaseBegin;
        public Id id;
        public Organization organization;
        public OperatingUnit operatingUnit;
        public Code code;
        public Name name;
        public LongDescription longDescription;
        public ShortDescription shortDescription;
        public SearchDescription searchDescription;
        public BoxBaseEnd boxBaseEnd;
        public TabBaseEnd tabBaseEnd;
        public TabLogInfoBegin tabLogInfoBegin;
        public BoxLogInfoBegin boxLogInfoBegin;
        public CreationDateTime creationDateTime;
        public CreationUser creationUser;
        public LastUpdateDateTime lastUpdateDateTime;
        public LastUpdateUser lastUpdateUser;
        public BoxLogInfoEnd boxLogInfoEnd;
        public TabLogInfoEnd tabLogInfoEnd;
    }

    public class CollectionStructure{
        public TabBaseBegin tabBaseBegin;
        public BoxBaseBegin boxBaseBegin;
        public Id id;
        public Organization organization;
        public OperatingUnit operatingUnit;
        public Code code;
        public Name name;
        public LongDescription longDescription;
        public ShortDescription shortDescription;
        public SearchDescription searchDescription;
        public BoxBaseEnd boxBaseEnd;
        public TabBaseEnd tabBaseEnd;
        public TabLogInfoBegin tabLogInfoBegin;
        public BoxLogInfoBegin boxLogInfoBegin;
        public CreationDateTime creationDateTime;
        public CreationUser creationUser;
        public LastUpdateDateTime lastUpdateDateTime;
        public LastUpdateUser lastUpdateUser;
        public BoxLogInfoEnd boxLogInfoEnd;
        public TabLogInfoEnd tabLogInfoEnd;
    }

    public class CodeAttributeDecoVals{
        public String organization;
        public String operatingUnit;
    }

    public class DefaultValuesBean{
        public String organization;
        public String operatingUnit;
        @JsonProperty("CodeAttributeDecoVals")
        public CodeAttributeDecoVals codeAttributeDecoVals;
    }

    public class ClientParams{
        public String rReqType;
        public String rEntityName;
        public String _;
        public String controller;
        public Object format;
        public String action;
    }

    public class Root{
        public String _appVersion;
        public String _entityName;
        public String _pattern;
        public String _showEntityForm;
        public Schema _schema;
        public String _entityTitle;
        public int _callCustomizeObject;
        public int _callCustomizeCollection;
        public List<Object> _extEqbs;
        public Toolbars toolbars;
        @JsonProperty("Attributes")
        public Attributes attributes;
        @JsonProperty("ObjectStructure")
        public ObjectStructure objectStructure;
        @JsonProperty("CollectionStructure")
        public CollectionStructure collectionStructure;
        public List<String> entityKeys;
        public List<Object> childQueryKeys;
        public List<Object> fatherQueryKeys;
        public List<String> hideOnCreateFields;
        public List<String> hideOnUpdateFields;
        public List<String> hideOnViewFields;
        public List<String> hideOnListFields;
        public List<String> mandatoryInUIFields;
        public List<Object> mandatoryInServerFields;
        public List<String> onEditOnlyFields;
        public List<String> alwaysReadOnlyFields;
        public List<Object> headerEntryFields;
        @JsonProperty("DefaultValuesBean")
        public DefaultValuesBean defaultValuesBean;
        public String rReqType;
        public String rEntityName;
        public String _;
        public String controller;
        public Object format;
        public String action;
        public ClientParams clientParams;
    }


}
