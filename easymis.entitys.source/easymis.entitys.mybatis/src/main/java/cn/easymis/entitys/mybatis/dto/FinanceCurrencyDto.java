package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable;

import cn.easymis.commons.code.util.annotation.GenField;
import cn.easymis.commons.code.util.annotation.GenModel;
import cn.easymis.commons.code.util.annotation.GenTable; 
 
  
  
 @GenTable(name="finance_currency") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="FinanceCurrency")  
 public class FinanceCurrencyDto implements Serializable{  
      @GenField(labelname="",column="currency_id",id=true,length=20,isnull=false) 
      private String currencyId; 
      @GenField(labelname="编码",column="currency_number",length=20,isnull=true) 
      private String currencyNumber; 
      @GenField(labelname="币别",column="currency_name",length=255,isnull=true) 
      private String currencyName; 
      @GenField(labelname="汇率",column="currency_rate",length=255,isnull=true) 
      private String currencyRate; 
      @GenField(labelname="",column="org_id",length=20,isnull=true) 
      private String orgId; 
      @GenField(labelname="是否本位币",column="natural",length=255,isnull=true) 
      private String natural; 
      public String getCurrencyId(){ 
      	   return currencyId;
      }
      public void setCurrencyId(String currencyId){ 
      	   this.currencyId=currencyId; 
      } 
      public String getCurrencyNumber(){ 
      	   return currencyNumber;
      }
      public void setCurrencyNumber(String currencyNumber){ 
      	   this.currencyNumber=currencyNumber; 
      } 
      public String getCurrencyName(){ 
      	   return currencyName;
      }
      public void setCurrencyName(String currencyName){ 
      	   this.currencyName=currencyName; 
      } 
      public String getCurrencyRate(){ 
      	   return currencyRate;
      }
      public void setCurrencyRate(String currencyRate){ 
      	   this.currencyRate=currencyRate; 
      } 
      public String getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(String orgId){ 
      	   this.orgId=orgId; 
      } 
      public String getNatural(){ 
      	   return natural;
      }
      public void setNatural(String natural){ 
      	   this.natural=natural; 
      } 
}