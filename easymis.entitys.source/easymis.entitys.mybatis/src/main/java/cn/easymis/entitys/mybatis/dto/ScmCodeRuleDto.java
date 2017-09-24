package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable; 
import cn.easymis.commons.code.util.annotation.GenField; 
import cn.easymis.commons.code.util.annotation.GenModel; 
import cn.easymis.commons.code.util.annotation.GenTable; 
import java.util.*; 
 
  
  
 @GenTable(name="scm_coderule") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="ScmCodeRule")  
 public class ScmCodeRuleDto implements Serializable{  
      @GenField(labelname="",column="coderule_id",id=true,length=20,isnull=false) 
      private String coderuleId; 
      @GenField(labelname="单据类型",column="bill_type",length=20,isnull=true) 
      private String billType; 
      @GenField(labelname="规则名称",column="name",length=255,isnull=true) 
      private String name; 
      @GenField(labelname="范例【编号规则】",column="demo",length=255,isnull=true) 
      private String demo; 
      @GenField(labelname="起始编号",column="start_no",length=255,isnull=true) 
      private String startNo; 
      @GenField(labelname="默认状态",column="defaults",length=255,isnull=true) 
      private String defaults; 
      @GenField(labelname="编码前缀",column="prefix",length=255,isnull=true) 
      private String prefix; 
      @GenField(labelname="编码位数",column="digits",length=255,isnull=true) 
      private String digits; 
      @GenField(labelname="组织ID",column="org_id",length=20,isnull=true) 
      private String orgId; 
      public String getCoderuleId(){ 
      	   return coderuleId;
      }
      public void setCoderuleId(String coderuleId){ 
      	   this.coderuleId=coderuleId; 
      } 
      public String getBillType(){ 
      	   return billType;
      }
      public void setBillType(String billType){ 
      	   this.billType=billType; 
      } 
      public String getName(){ 
      	   return name;
      }
      public void setName(String name){ 
      	   this.name=name; 
      } 
      public String getDemo(){ 
      	   return demo;
      }
      public void setDemo(String demo){ 
      	   this.demo=demo; 
      } 
      public String getStartNo(){ 
      	   return startNo;
      }
      public void setStartNo(String startNo){ 
      	   this.startNo=startNo; 
      } 
      public String getDefaults(){ 
      	   return defaults;
      }
      public void setDefaults(String defaults){ 
      	   this.defaults=defaults; 
      } 
      public String getPrefix(){ 
      	   return prefix;
      }
      public void setPrefix(String prefix){ 
      	   this.prefix=prefix; 
      } 
      public String getDigits(){ 
      	   return digits;
      }
      public void setDigits(String digits){ 
      	   this.digits=digits; 
      } 
      public String getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(String orgId){ 
      	   this.orgId=orgId; 
      } 
}