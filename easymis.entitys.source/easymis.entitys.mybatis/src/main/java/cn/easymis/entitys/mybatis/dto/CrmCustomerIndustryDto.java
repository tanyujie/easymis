package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable; 
import cn.easymis.commons.code.util.annotation.GenField; 
import cn.easymis.commons.code.util.annotation.GenModel; 
import cn.easymis.commons.code.util.annotation.GenTable; 
import java.util.*; 
 
  
  
 @GenTable(name="crm_customer_industry") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="CrmCustomerIndustry")  
 public class CrmCustomerIndustryDto implements Serializable{  
      @GenField(labelname="",column="industry_id",id=true,length=20,isnull=false) 
      private String industryId; 
      @GenField(labelname="",column="industry_name",length=45,isnull=false) 
      private String industryName; 
      @GenField(labelname="",column="level",length=45,isnull=false) 
      private String level; 
      @GenField(labelname="",column="depict",length=500,isnull=false) 
      private String depict; 
      @GenField(labelname="",column="org_id",length=20,isnull=true) 
      private String orgId; 
      public String getIndustryId(){ 
      	   return industryId;
      }
      public void setIndustryId(String industryId){ 
      	   this.industryId=industryId; 
      } 
      public String getIndustryName(){ 
      	   return industryName;
      }
      public void setIndustryName(String industryName){ 
      	   this.industryName=industryName; 
      } 
      public String getLevel(){ 
      	   return level;
      }
      public void setLevel(String level){ 
      	   this.level=level; 
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
}