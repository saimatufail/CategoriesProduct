package com.example.home.categoriesprodcut;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryPojo {

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
    @SerializedName("product_count")
    @Expose
    private Integer productCount;
    @SerializedName("children_data")
    @Expose
    private List<ChildData> childrenData = null;

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

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public List<ChildData> getChildrenData() {
        return childrenData;
    }

    public void setChildrenData(List<ChildData> childrenData) {
        this.childrenData = childrenData;
    }

    public class ChildData {

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
        private Boolean isActive;
        @SerializedName("position")
        @Expose
        private Integer position;
        @SerializedName("level")
        @Expose
        private Integer level;
        @SerializedName("product_count")
        @Expose
        private Integer productCount;
        @SerializedName("children_data")
        @Expose
        private List<ChildData_> childrenData = null;

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

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
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

        public Integer getProductCount() {
            return productCount;
        }

        public void setProductCount(Integer productCount) {
            this.productCount = productCount;
        }

        public List<ChildData_> getChildrenData() {
            return childrenData;
        }

        public void setChildrenData(List<ChildData_> childrenData) {
            this.childrenData = childrenData;
        }

    }

    public class ChildData_ {

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
        private Boolean isActive;
        @SerializedName("position")
        @Expose
        private Integer position;
        @SerializedName("level")
        @Expose
        private Integer level;
        @SerializedName("product_count")
        @Expose
        private Integer productCount;
        @SerializedName("children_data")
        @Expose
        private List<ChildData__> childrenData = null;

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

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
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

        public Integer getProductCount() {
            return productCount;
        }

        public void setProductCount(Integer productCount) {
            this.productCount = productCount;
        }

        public List<ChildData__> getChildrenData() {
            return childrenData;
        }

        public void setChildrenData(List<ChildData__> childrenData) {
            this.childrenData = childrenData;
        }

    }

    public class ChildData__ {

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
        private Boolean isActive;
        @SerializedName("position")
        @Expose
        private Integer position;
        @SerializedName("level")
        @Expose
        private Integer level;
        @SerializedName("product_count")
        @Expose
        private Integer productCount;
        @SerializedName("children_data")
        @Expose
        private List<Object> childrenData = null;

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

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
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

        public Integer getProductCount() {
            return productCount;
        }

        public void setProductCount(Integer productCount) {
            this.productCount = productCount;
        }

        public List<Object> getChildrenData() {
            return childrenData;
        }

        public void setChildrenData(List<Object> childrenData) {
            this.childrenData = childrenData;
        }

    }
}
