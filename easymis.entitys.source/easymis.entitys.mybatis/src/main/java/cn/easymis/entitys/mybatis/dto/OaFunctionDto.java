package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable;

import cn.easymis.commons.code.util.annotation.GenField;
import cn.easymis.commons.code.util.annotation.GenModel;
import cn.easymis.commons.code.util.annotation.GenTable; 
 
  
  
 @GenTable(name="oa_function") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="OaFunction")  
 public class OaFunctionDto implements Serializable{  
      @GenField(labelname="菜单ID",column="function_id",id=true,length=20,isnull=false) 
      private String functionId; 
      @GenField(labelname="",column="org_id",length=20,isnull=true) 
      private String orgId; 
      @GenField(labelname="",column="sys_code",length=20,isnull=false) 
      private String sysCode; 
      @GenField(labelname="",column="function_name",length=1032,isnull=false) 
      private String functionName; 
      @GenField(labelname="",column="parent_id",length=20,isnull=false) 
      private String parentId; 
      @GenField(labelname="",column="level",isnull=false) 
      private Integer level; 
      @GenField(labelname="",column="display_name",length=1032,isnull=true) 
      private String displayName; 
      @GenField(labelname="",column="url",length=64,isnull=true) 
      private String url; 
      @GenField(labelname="",column="priority",isnull=true) 
      private Integer priority; 
      @GenField(labelname="",column="depict",length=200,isnull=true) 
      private String depict; 
      @GenField(labelname="是否删除1已删除",column="is_deleted",isnull=true) 
      private Integer isDeleted; 
      public String getFunctionId(){ 
      	   return functionId;
      }
      public void setFunctionId(String functionId){ 
      	   this.functionId=functionId; 
      } 
      public String getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(String orgId){ 
      	   this.orgId=orgId; 
      } 
      public String getSysCode(){ 
      	   return sysCode;
      }
      public void setSysCode(String sysCode){ 
      	   this.sysCode=sysCode; 
      } 
      public String getFunctionName(){ 
      	   return functionName;
      }
      public void setFunctionName(String functionName){ 
      	   this.functionName=functionName; 
      } 
      public String getParentId(){ 
      	   return parentId;
      }
      public void setParentId(String parentId){ 
      	   this.parentId=parentId; 
      } 
      public Integer getLevel(){ 
      	   return level;
      }
      public void setLevel(Integer level){ 
      	   this.level=level; 
      } 
      public String getDisplayName(){ 
      	   return displayName;
      }
      public void setDisplayName(String displayName){ 
      	   this.displayName=displayName; 
      } 
      public String getUrl(){ 
      	   return url;
      }
      public void setUrl(String url){ 
      	   this.url=url; 
      } 
      public Integer getPriority(){ 
      	   return priority;
      }
      public void setPriority(Integer priority){ 
      	   this.priority=priority; 
      } 
      public String getDepict(){ 
      	   return depict;
      }
      public void setDepict(String depict){ 
      	   this.depict=depict; 
      } 
      public Integer getIsDeleted(){ 
      	   return isDeleted;
      }
      public void setIsDeleted(Integer isDeleted){ 
      	   this.isDeleted=isDeleted; 
      } 
}