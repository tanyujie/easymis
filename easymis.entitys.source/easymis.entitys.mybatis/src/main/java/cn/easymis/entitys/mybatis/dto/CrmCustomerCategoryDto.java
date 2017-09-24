package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable; 
import cn.easymis.commons.code.util.annotation.GenField; 
import cn.easymis.commons.code.util.annotation.GenModel; 
import cn.easymis.commons.code.util.annotation.GenTable; 
import java.util.*; 
 
  
  
 @GenTable(name="crm_customer_category") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="CrmCustomerCategory")  
 public class CrmCustomerCategoryDto implements Serializable{  
      @GenField(labelname="",column="category_id",id=true,length=45,isnull=false) 
      private String categoryId; 
      @GenField(labelname="",column="category_name",length=45,isnull=false) 
      private String categoryName; 
      @GenField(labelname="",column="depict",length=500,isnull=false) 
      private String depict; 
      @GenField(labelname="",column="org_id",length=20,isnull=true) 
      private String orgId; 
      @GenField(labelname="",column="parent_id",length=20,isnull=true) 
      private String parentId; 
      @GenField(labelname="",column="priority",isnull=true) 
      private Integer priority; 
      @GenField(labelname="",column="level",isnull=true) 
      private Integer level; 
      @GenField(labelname="",column="is_leaf",isnull=true) 
      private Integer isLeaf; 
      public String getCategoryId(){ 
      	   return categoryId;
      }
      public void setCategoryId(String categoryId){ 
      	   this.categoryId=categoryId; 
      } 
      public String getCategoryName(){ 
      	   return categoryName;
      }
      public void setCategoryName(String categoryName){ 
      	   this.categoryName=categoryName; 
      } 
      public String getDepict(){ 
      	   return depict;
      }
      public void setDepict(String depict){ 
      	   this.depict=depict; 
      } 
      public String getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(String orgId){ 
      	   this.orgId=orgId; 
      } 
      public String getParentId(){ 
      	   return parentId;
      }
      public void setParentId(String parentId){ 
      	   this.parentId=parentId; 
      } 
      public Integer getPriority(){ 
      	   return priority;
      }
      public void setPriority(Integer priority){ 
      	   this.priority=priority; 
      } 
      public Integer getLevel(){ 
      	   return level;
      }
      public void setLevel(Integer level){ 
      	   this.level=level; 
      } 
      public Integer getIsLeaf(){ 
      	   return isLeaf;
      }
      public void setIsLeaf(Integer isLeaf){ 
      	   this.isLeaf=isLeaf; 
      } 
}