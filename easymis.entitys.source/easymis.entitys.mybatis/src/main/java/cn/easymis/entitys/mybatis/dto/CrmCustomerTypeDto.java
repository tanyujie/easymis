package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable; 
import cn.easymis.commons.code.util.annotation.GenField; 
import cn.easymis.commons.code.util.annotation.GenModel; 
import cn.easymis.commons.code.util.annotation.GenTable; 
import java.util.*; 
 
  
  
 @GenTable(name="crm_customer_type") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="CrmCustomerType")  
 public class CrmCustomerTypeDto implements Serializable{  
      @GenField(labelname="",column="type_id",length=20,isnull=false) 
      private String typeId; 
      @GenField(labelname="",column="org_id",isnull=false) 
      private Integer orgId; 
      @GenField(labelname="类别名称",column="type_name",length=255,isnull=false) 
      private String typeName; 
      public String getTypeId(){ 
      	   return typeId;
      }
      public void setTypeId(String typeId){ 
      	   this.typeId=typeId; 
      } 
      public Integer getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(Integer orgId){ 
      	   this.orgId=orgId; 
      } 
      public String getTypeName(){ 
      	   return typeName;
      }
      public void setTypeName(String typeName){ 
      	   this.typeName=typeName; 
      } 
}