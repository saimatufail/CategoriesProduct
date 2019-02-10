package com.example.home.categoriesprodcut;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductsPojo {

    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("search_criteria")
    @Expose
    private SearchCriteria searchCriteria;
    @SerializedName("total_count")
    @Expose
    private Integer totalCount;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public class CategoryLink {

        @SerializedName("position")
        @Expose
        private Integer position;
        @SerializedName("category_id")
        @Expose
        private String categoryId;

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

    }

    public class ConfigurableProductOption {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("attribute_id")
        @Expose
        private String attributeId;
        @SerializedName("label")
        @Expose
        private String label;
        @SerializedName("position")
        @Expose
        private Integer position;
        @SerializedName("values")
        @Expose
        private List<Value> values = null;
        @SerializedName("product_id")
        @Expose
        private Integer productId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getAttributeId() {
            return attributeId;
        }

        public void setAttributeId(String attributeId) {
            this.attributeId = attributeId;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

        public List<Value> getValues() {
            return values;
        }

        public void setValues(List<Value> values) {
            this.values = values;
        }

        public Integer getProductId() {
            return productId;
        }

        public void setProductId(Integer productId) {
            this.productId = productId;
        }

    }

    /*public class CustomAttribute {

        @SerializedName("attribute_code")
        @Expose
        private String attributeCode;
        @SerializedName("value")
        @Expose
        private List<String> value = null;

        public String getAttributeCode() {
            return attributeCode;
        }

        public void setAttributeCode(String attributeCode) {
            this.attributeCode = attributeCode;
        }

        public List<String> getValue() {
            return value;
        }

        public void setValue(List<String> value) {
            this.value = value;
        }

    }*/

    public class ExtensionAttributes {

        @SerializedName("website_ids")
        @Expose
        private List<Integer> websiteIds = null;
        @SerializedName("category_links")
        @Expose
        private List<CategoryLink> categoryLinks = null;
        @SerializedName("configurable_product_options")
        @Expose
        private List<ConfigurableProductOption> configurableProductOptions = null;
        @SerializedName("configurable_product_links")
        @Expose
        private List<Integer> configurableProductLinks = null;

        public List<Integer> getWebsiteIds() {
            return websiteIds;
        }

        public void setWebsiteIds(List<Integer> websiteIds) {
            this.websiteIds = websiteIds;
        }

        public List<CategoryLink> getCategoryLinks() {
            return categoryLinks;
        }

        public void setCategoryLinks(List<CategoryLink> categoryLinks) {
            this.categoryLinks = categoryLinks;
        }

        public List<ConfigurableProductOption> getConfigurableProductOptions() {
            return configurableProductOptions;
        }

        public void setConfigurableProductOptions(List<ConfigurableProductOption> configurableProductOptions) {
            this.configurableProductOptions = configurableProductOptions;
        }

        public List<Integer> getConfigurableProductLinks() {
            return configurableProductLinks;
        }

        public void setConfigurableProductLinks(List<Integer> configurableProductLinks) {
            this.configurableProductLinks = configurableProductLinks;
        }

    }

    public class Filter {

        @SerializedName("field")
        @Expose
        private String field;
        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("condition_type")
        @Expose
        private String conditionType;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getConditionType() {
            return conditionType;
        }

        public void setConditionType(String conditionType) {
            this.conditionType = conditionType;
        }

    }

    public class FilterGroup {

        @SerializedName("filters")
        @Expose
        private List<Filter> filters = null;

        public List<Filter> getFilters() {
            return filters;
        }

        public void setFilters(List<Filter> filters) {
            this.filters = filters;
        }

    }

    public class Item {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("sku")
        @Expose
        private String sku;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("attribute_set_id")
        @Expose
        private Integer attributeSetId;
        @SerializedName("price")
        @Expose
        private Integer price;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("visibility")
        @Expose
        private Integer visibility;
        @SerializedName("type_id")
        @Expose
        private String typeId;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("extension_attributes")
        @Expose
        private ExtensionAttributes extensionAttributes;
        @SerializedName("product_links")
        @Expose
        private List<Object> productLinks = null;
        @SerializedName("options")
        @Expose
        private List<Option> options = null;
        @SerializedName("media_gallery_entries")
        @Expose
        private List<MediaGalleryEntry> mediaGalleryEntries = null;
        @SerializedName("tier_prices")
        @Expose
        private List<Object> tierPrices = null;
        /*@SerializedName("custom_attributes")
        @Expose
        private List<CustomAttribute> customAttributes = null;*/

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAttributeSetId() {
            return attributeSetId;
        }

        public void setAttributeSetId(Integer attributeSetId) {
            this.attributeSetId = attributeSetId;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getVisibility() {
            return visibility;
        }

        public void setVisibility(Integer visibility) {
            this.visibility = visibility;
        }

        public String getTypeId() {
            return typeId;
        }

        public void setTypeId(String typeId) {
            this.typeId = typeId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public ExtensionAttributes getExtensionAttributes() {
            return extensionAttributes;
        }

        public void setExtensionAttributes(ExtensionAttributes extensionAttributes) {
            this.extensionAttributes = extensionAttributes;
        }

        public List<Object> getProductLinks() {
            return productLinks;
        }

        public void setProductLinks(List<Object> productLinks) {
            this.productLinks = productLinks;
        }

        public List<Option> getOptions() {
            return options;
        }

        public void setOptions(List<Option> options) {
            this.options = options;
        }

        public List<MediaGalleryEntry> getMediaGalleryEntries() {
            return mediaGalleryEntries;
        }

        public void setMediaGalleryEntries(List<MediaGalleryEntry> mediaGalleryEntries) {
            this.mediaGalleryEntries = mediaGalleryEntries;
        }

        public List<Object> getTierPrices() {
            return tierPrices;
        }

        public void setTierPrices(List<Object> tierPrices) {
            this.tierPrices = tierPrices;
        }

        /*public List<CustomAttribute> getCustomAttributes() {
            return customAttributes;
        }

        public void setCustomAttributes(List<CustomAttribute> customAttributes) {
            this.customAttributes = customAttributes;
        }*/

    }

    public class MediaGalleryEntry {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("media_type")
        @Expose
        private String mediaType;
        @SerializedName("label")
        @Expose
        private Object label;
        @SerializedName("position")
        @Expose
        private Integer position;
        @SerializedName("disabled")
        @Expose
        private Boolean disabled;
        @SerializedName("types")
        @Expose
        private List<String> types = null;
        @SerializedName("file")
        @Expose
        private String file;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getMediaType() {
            return mediaType;
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public Object getLabel() {
            return label;
        }

        public void setLabel(Object label) {
            this.label = label;
        }

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

        public Boolean getDisabled() {
            return disabled;
        }

        public void setDisabled(Boolean disabled) {
            this.disabled = disabled;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

    }

    public class Option {

        @SerializedName("product_sku")
        @Expose
        private String productSku;
        @SerializedName("option_id")
        @Expose
        private Integer optionId;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("sort_order")
        @Expose
        private Integer sortOrder;
        @SerializedName("is_require")
        @Expose
        private Boolean isRequire;
        @SerializedName("price")
        @Expose
        private Integer price;
        @SerializedName("price_type")
        @Expose
        private String priceType;
        @SerializedName("max_characters")
        @Expose
        private Integer maxCharacters;
        @SerializedName("image_size_x")
        @Expose
        private Integer imageSizeX;
        @SerializedName("image_size_y")
        @Expose
        private Integer imageSizeY;
        @SerializedName("values")
        @Expose
        private List<Value_> values = null;

        public String getProductSku() {
            return productSku;
        }

        public void setProductSku(String productSku) {
            this.productSku = productSku;
        }

        public Integer getOptionId() {
            return optionId;
        }

        public void setOptionId(Integer optionId) {
            this.optionId = optionId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getSortOrder() {
            return sortOrder;
        }

        public void setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
        }

        public Boolean getIsRequire() {
            return isRequire;
        }

        public void setIsRequire(Boolean isRequire) {
            this.isRequire = isRequire;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public String getPriceType() {
            return priceType;
        }

        public void setPriceType(String priceType) {
            this.priceType = priceType;
        }

        public Integer getMaxCharacters() {
            return maxCharacters;
        }

        public void setMaxCharacters(Integer maxCharacters) {
            this.maxCharacters = maxCharacters;
        }

        public Integer getImageSizeX() {
            return imageSizeX;
        }

        public void setImageSizeX(Integer imageSizeX) {
            this.imageSizeX = imageSizeX;
        }

        public Integer getImageSizeY() {
            return imageSizeY;
        }

        public void setImageSizeY(Integer imageSizeY) {
            this.imageSizeY = imageSizeY;
        }

        public List<Value_> getValues() {
            return values;
        }

        public void setValues(List<Value_> values) {
            this.values = values;
        }

    }

    public class SearchCriteria {

        @SerializedName("filter_groups")
        @Expose
        private List<FilterGroup> filterGroups = null;

        public List<FilterGroup> getFilterGroups() {
            return filterGroups;
        }

        public void setFilterGroups(List<FilterGroup> filterGroups) {
            this.filterGroups = filterGroups;
        }

    }

    public class Value {

        @SerializedName("value_index")
        @Expose
        private Integer valueIndex;

        public Integer getValueIndex() {
            return valueIndex;
        }

        public void setValueIndex(Integer valueIndex) {
            this.valueIndex = valueIndex;
        }

    }

    public class Value_ {

        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("sort_order")
        @Expose
        private Integer sortOrder;
        @SerializedName("price")
        @Expose
        private Integer price;
        @SerializedName("price_type")
        @Expose
        private String priceType;
        @SerializedName("option_type_id")
        @Expose
        private Integer optionTypeId;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getSortOrder() {
            return sortOrder;
        }

        public void setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public String getPriceType() {
            return priceType;
        }

        public void setPriceType(String priceType) {
            this.priceType = priceType;
        }

        public Integer getOptionTypeId() {
            return optionTypeId;
        }

        public void setOptionTypeId(Integer optionTypeId) {
            this.optionTypeId = optionTypeId;
        }

    }
}
