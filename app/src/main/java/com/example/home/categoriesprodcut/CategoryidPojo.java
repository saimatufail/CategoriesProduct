package com.example.home.categoriesprodcut;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryidPojo {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("is_active")
    @Expose
    private Object isActive;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("children")
    @Expose
    private String children;
    @SerializedName("created_at")
    @Expose
    private String created_at;
    @SerializedName("updated_at")
    @Expose
    private String updated_at;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("include_in_menu")
    @Expose
    private String include_in_menu;

    @SerializedName("custom_attributes")
    @Expose
    private List<custom_attributes> childrenData = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getIsActive() {
        return isActive;
    }

    public void setIsActive(Object isActive) {
        this.isActive = isActive;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at= created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at= updated_at;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path= path;
    }

    public String getInclude_in_menu() {
        return include_in_menu;
    }

    public void setInclude_in_menu(String include_in_menu) {
        this.include_in_menu= include_in_menu;
    }

    public List<custom_attributes> getChildrenData() {
        return childrenData;
    }

    public void setChildrenData(List<custom_attributes> childrenData) {
        this.childrenData = childrenData;
    }

    public class custom_attributes {

        @SerializedName("attribute_code")
        @Expose
        private String attribute_code;
        @SerializedName("value")
        @Expose
        private String value;
//        @SerializedName("name")
//        @Expose
//        private String name;
//        @SerializedName("is_active")
//        @Expose
//        private Boolean isActive;
//        @SerializedName("position")
//        @Expose
//        private Integer position;
//        @SerializedName("level")
//        @Expose
//        private Integer level;
//        @SerializedName("product_count")
//        @Expose
//        private Integer productCount;
        @SerializedName("children_data")
        @Expose
        private List<custom_attributes_> childrenData = null;

        public String getAttribute_code () {
            return attribute_code;
        }

        public void setAttribute_code(String attribute_code) {
            this.attribute_code = attribute_code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public Boolean getIsActive() {
//            return isActive;
//        }
//
//        public void setIsActive(Boolean isActive) {
//            this.isActive = isActive;
//        }
//
//        public Integer getPosition() {
//            return position;
//        }
//
//        public void setPosition(Integer position) {
//            this.position = position;
//        }
//
//        public Integer getLevel() {
//            return level;
//        }
//
//        public void setLevel(Integer level) {
//            this.level = level;
//        }
//
//        public Integer getProductCount() {
//            return productCount;
//        }
//
//        public void setProductCount(Integer productCount) {
//            this.productCount = productCount;
//        }

        public List<custom_attributes_> getChildrenData() {
            return childrenData;
        }

        public void setChildrenData(List<custom_attributes_> childrenData) {
            this.childrenData = childrenData;
        }

    }

    public class custom_attributes_ {

        @SerializedName("attribute_code")
        @Expose
        private String attribute_code;
        @SerializedName("value")
        @Expose
        private String value;
//        @SerializedName("name")
//        @Expose
//        private String name;
//        @SerializedName("is_active")
//        @Expose
//        private Boolean isActive;
//        @SerializedName("position")
//        @Expose
//        private Integer position;
//        @SerializedName("level")
//        @Expose
//        private Integer level;
//        @SerializedName("product_count")
//        @Expose
//        private Integer productCount;
        @SerializedName("children_data")
        @Expose
        private List<custom_attributes__> childrenData = null;

        public String getattribute_code() {
            return attribute_code;
        }

        public void setattribute_code(String attribute_code) {
            this.attribute_code = attribute_code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public Boolean getIsActive() {
//            return isActive;
//        }
//
//        public void setIsActive(Boolean isActive) {
//            this.isActive = isActive;
//        }
//
//        public Integer getPosition() {
//            return position;
//        }
//
//        public void setPosition(Integer position) {
//            this.position = position;
//        }
//
//        public Integer getLevel() {
//            return level;
//        }
//
//        public void setLevel(Integer level) {
//            this.level = level;
//        }
//
//        public Integer getProductCount() {
//            return productCount;
//        }
//
//        public void setProductCount(Integer productCount) {
//            this.productCount = productCount;
//        }

        public List<custom_attributes__> getChildrenData() {
            return childrenData;
        }

        public void setChildrenData(List<custom_attributes__> childrenData) {
            this.childrenData = childrenData;
        }

    }

    public class custom_attributes__{

        @SerializedName("attribute_code")
        @Expose
        private String attribute_code;
        @SerializedName("value")
        @Expose
        private String value;

        @SerializedName("children_data")
        @Expose
        private List<Object> childrenData = null;

        public String getAttribute_code() {
            return attribute_code;
        }

        public void setAttribute_code(String attribute_code) {
            this.attribute_code = attribute_code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public Boolean getIsActive() {
//            return isActive;
//        }
//
//        public void setIsActive(Boolean isActive) {
//            this.isActive = isActive;
//        }
//
//        public Integer getPosition() {
//            return position;
//        }
//
//        public void setPosition(Integer position) {
//            this.position = position;
//        }
//
//        public Integer getLevel() {
//            return level;
//        }
//
//        public void setLevel(Integer level) {
//            this.level = level;
//        }
//
//        public Integer getProductCount() {
//            return productCount;
//        }
//
//        public void setProductCount(Integer productCount) {
//            this.productCount = productCount;
//        }

        public List<Object> getChildrenData() {
            return childrenData;
        }

        public void setChildrenData(List<Object> childrenData) {
            this.childrenData = childrenData;
        }

    }
}


