package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable; 
import cn.easymis.commons.code.util.annotation.GenField; 
import cn.easymis.commons.code.util.annotation.GenModel; 
import cn.easymis.commons.code.util.annotation.GenTable; 
import java.util.*; 
 
  
  
 @GenTable(name="crm_contract") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="CrmContract")  
 public class CrmContractDto implements Serializable{  
      @GenField(labelname="",column="contract_id",id=true,length=20,isnull=false) 
      private String contractId; 
      @GenField(labelname="",column="creator_id",length=20,isnull=false) 
      private String creatorId; 
      @GenField(labelname="",column="org_id",length=20,isnull=false) 
      private String orgId; 
      @GenField(labelname="",column="customer_Id",length=20,isnull=false) 
      private String customerId; 
      @GenField(labelname="",column="sales_Id",length=20,isnull=false) 
      private String salesId; 
      @GenField(labelname="",column="code",length=255,isnull=true) 
      private String code; 
      @GenField(labelname="",column="contract_title",length=255,isnull=true) 
      private String contractTitle; 
      @GenField(labelname="",column="begin_Date",isnull=true) 
      private Date beginDate; 
      @GenField(labelname="",column="end_Date",isnull=true) 
      private Date endDate; 
      @GenField(labelname="",column="amount",length=255,isnull=true) 
      private String amount; 
      @GenField(labelname="",column="owner_Id",isnull=true) 
      private Integer ownerId; 
      public String getContractId(){ 
      	   return contractId;
      }
      public void setContractId(String contractId){ 
      	   this.contractId=contractId; 
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
      public String getSalesId(){ 
      	   return salesId;
      }
      public void setSalesId(String salesId){ 
      	   this.salesId=salesId; 
      } 
      public String getCode(){ 
      	   return code;
      }
      public void setCode(String code){ 
      	   this.code=code; 
      } 
      public String getContractTitle(){ 
      	   return contractTitle;
      }
      public void setContractTitle(String contractTitle){ 
      	   this.contractTitle=contractTitle; 
      } 
      public Date getBeginDate(){ 
      	   return beginDate;
      }
      public void setBeginDate(Date beginDate){ 
      	   this.beginDate=beginDate; 
      } 
      public Date getEndDate(){ 
      	   return endDate;
      }
      public void setEndDate(Date endDate){ 
      	   this.endDate=endDate; 
      } 
      public String getAmount(){ 
      	   return amount;
      }
      public void setAmount(String amount){ 
      	   this.amount=amount; 
      } 
      public Integer getOwnerId(){ 
      	   return ownerId;
      }
      public void setOwnerId(Integer ownerId){ 
      	   this.ownerId=ownerId; 
      } 
}