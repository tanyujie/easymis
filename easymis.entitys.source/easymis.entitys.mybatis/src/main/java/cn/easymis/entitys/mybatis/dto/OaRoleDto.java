package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable;

import cn.easymis.commons.code.util.annotation.GenField;
import cn.easymis.commons.code.util.annotation.GenModel;
import cn.easymis.commons.code.util.annotation.GenTable; 
 
  
  
 @GenTable(name="oa_role") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="OaRole")  
 public class OaRoleDto implements Serializable{  
      @GenField(labelname="",column="role_id",id=true,length=20,isnull=false) 
      private String roleId; 
      @GenField(labelname="",column="org_id",length=20,isnull=true) 
      private String orgId; 
      @GenField(labelname="",column="role_name",length=255,isnull=true) 
      private String roleName; 
      @GenField(labelname="",column="priority",isnull=true) 
      private Integer priority; 
      @GenField(labelname="",column="is_super",isnull=true) 
      private Integer isSuper; 
      @GenField(labelname="",column="depict",length=255,isnull=true) 
      private String depict; 
      @GenField(labelname="",column="level",isnull=true) 
      private Integer level; 
      public String getRoleId(){ 
      	   return roleId;
      }
      public void setRoleId(String roleId){ 
      	   this.roleId=roleId; 
      } 
      public String getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(String orgId){ 
      	   this.orgId=orgId; 
      } 
      public String getRoleName(){ 
      	   return roleName;
      }
      public void setRoleName(String roleName){ 
      	   this.roleName=roleName; 
      } 
      public Integer getPriority(){ 
      	   return priority;
      }
      public void setPriority(Integer priority){ 
      	   this.priority=priority; 
      } 
      public Integer getIsSuper(){ 
      	   return isSuper;
      }
      public void setIsSuper(Integer isSuper){ 
      	   this.isSuper=isSuper; 
      } 
      public String getDepict(){ 
      	   return depict;
      }
      public void setDepict(String depict){ 
      	   this.depict=depict; 
      } 
      public Integer getLevel(){ 
      	   return level;
      }
      public void setLevel(Integer level){ 
      	   this.level=level; 
      } 
}