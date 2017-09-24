package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable; 
import cn.easymis.commons.code.util.annotation.GenField; 
import cn.easymis.commons.code.util.annotation.GenModel; 
import cn.easymis.commons.code.util.annotation.GenTable; 
import java.util.*; 
 
  
  
 @GenTable(name="crm_visit") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="CrmVisit")  
 public class CrmVisitDto implements Serializable{  
      @GenField(labelname="",column="visit_id",id=true,length=20,isnull=false) 
      private String visitId; 
      @GenField(labelname="",column="creator_id",length=20,isnull=false) 
      private String creatorId; 
      @GenField(labelname="",column="org_id",length=20,isnull=false) 
      private String orgId; 
      @GenField(labelname="",column="customer_Id",length=20,isnull=true) 
      private String customerId; 
      @GenField(labelname="主题",column="topic",length=255,isnull=true) 
      private String topic; 
      @GenField(labelname="",column="visit_Date",isnull=true) 
      private Date visitDate; 
      public String getVisitId(){ 
      	   return visitId;
      }
      public void setVisitId(String visitId){ 
      	   this.visitId=visitId; 
      } 
      public String getCreatorId(){ 
      	   return creatorId;
      }
      public void setCreatorId(String creatorId){ 
      	   this.creatorId=creatorId; 
      } 
      public String getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(String orgId){ 
      	   this.orgId=orgId; 
      } 
      public String getCustomerId(){ 
      	   return customerId;
      }
      public void setCustomerId(String customerId){ 
      	   this.customerId=customerId; 
      } 
      public String getTopic(){ 
      	   return topic;
      }
      public void setTopic(String topic){ 
      	   this.topic=topic; 
      } 
      public Date getVisitDate(){ 
      	   return visitDate;
      }
      public void setVisitDate(Date visitDate){ 
      	   this.visitDate=visitDate; 
      } 
}