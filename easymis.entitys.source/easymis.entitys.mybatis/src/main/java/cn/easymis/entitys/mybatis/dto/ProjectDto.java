package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable;
import java.util.Date;

import cn.easymis.commons.code.util.annotation.GenField;
import cn.easymis.commons.code.util.annotation.GenModel;
import cn.easymis.commons.code.util.annotation.GenTable; 
 
  
  
 @GenTable(name="project") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="Project")  
 public class ProjectDto implements Serializable{  
      @GenField(labelname="id",column="project_id",id=true,length=20,isnull=false) 
      private String projectId; 
      @GenField(labelname="组织编码",column="org_id",length=45,isnull=false) 
      private String orgId; 
      @GenField(labelname="参与部门",column="dept_id",length=45,isnull=true) 
      private String deptId; 
      @GenField(labelname="项目名称",column="project_name",length=45,isnull=true) 
      private String projectName; 
      @GenField(labelname="描述",column="depict",length=45,isnull=true) 
      private String depict; 
      @GenField(labelname="项目编号",column="project_Code",length=45,isnull=true) 
      private String projectCode; 
      @GenField(labelname="项目类别",column="type",length=45,isnull=true) 
      private String type; 
      @GenField(labelname="最00后:0修0:改00时间",column="updateTime",isnull=true) 
      private Date updateTime; 
      @GenField(labelname="计划周期开始时间",column="begin_date",isnull=true) 
      private Date beginDate; 
      @GenField(labelname="计划周期结束时间",column="end_date",isnull=true) 
      private Date endDate; 
      @GenField(labelname="",column="act_begin_date",isnull=true) 
      private Date actBeginDate; 
      @GenField(labelname="实际结束时间",column="act_End_date",isnull=true) 
      private Date actEndDate; 
      @GenField(labelname="项目所有者(项目经理)",column="owner_Id",length=45,isnull=true) 
      private String ownerId; 
      @GenField(labelname="目负责人(分管领导)",column="leader_Id",length=45,isnull=true) 
      private String leaderId; 
      @GenField(labelname="项目查看者",column="viewer",length=65535,isnull=true) 
      private String viewer; 
      @GenField(labelname="项目成员",column="user",length=45,isnull=true) 
      private String user; 
      @GenField(labelname="项目权限",column="priv",length=45,isnull=true) 
      private String priv; 
      @GenField(labelname="项目审批者",column="manger_Id",length=45,isnull=true) 
      private String mangerId; 
      @GenField(labelname="项目批注",column="comment",length=45,isnull=true) 
      private String comment; 
      @GenField(labelname="项目状态(0-立项中,1-审批中,2-项目审批通过/进行中,3-已结束)",column="status",isnull=true) 
      private Integer status; 
      @GenField(labelname="项目完成比例",column="percent_Complete",length=45,isnull=true) 
      private String percentComplete; 
      @GenField(labelname="经费类型",column="cost_Type",length=45,isnull=true) 
      private String costType; 
      @GenField(labelname="项目经费",column="cost_Money",length=45,isnull=true) 
      private String costMoney; 
      @GenField(labelname="审批日志",column="approve_Log",length=45,isnull=true) 
      private String approveLog; 
      @GenField(labelname="附件ID",column="attachment_Id",length=45,isnull=true) 
      private String attachmentId; 
      @GenField(labelname="附件名称",column="attachment_Name",length=45,isnull=true) 
      private String attachmentName; 
      @GenField(labelname="项目创建者",column="creator_id",length=45,isnull=true) 
      private String creatorId; 
      @GenField(labelname="相关客户",column="customer_id",length=45,isnull=true) 
      private String customerId; 
      public String getProjectId(){ 
      	   return projectId;
      }
      public void setProjectId(String projectId){ 
      	   this.projectId=projectId; 
      } 
      public String getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(String orgId){ 
      	   this.orgId=orgId; 
      } 
      public String getDeptId(){ 
      	   return deptId;
      }
      public void setDeptId(String deptId){ 
      	   this.deptId=deptId; 
      } 
      public String getProjectName(){ 
      	   return projectName;
      }
      public void setProjectName(String projectName){ 
      	   this.projectName=projectName; 
      } 
      public String getDepict(){ 
      	   return depict;
      }
      public void setDepict(String depict){ 
      	   this.depict=depict; 
      } 
      public String getProjectCode(){ 
      	   return projectCode;
      }
      public void setProjectCode(String projectCode){ 
      	   this.projectCode=projectCode; 
      } 
      public String getType(){ 
      	   return type;
      }
      public void setType(String type){ 
      	   this.type=type; 
      } 
      public Date getUpdateTime(){ 
      	   return updateTime;
      }
      public void setUpdateTime(Date updateTime){ 
      	   this.updateTime=updateTime; 
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
      public Date getActBeginDate(){ 
      	   return actBeginDate;
      }
      public void setActBeginDate(Date actBeginDate){ 
      	   this.actBeginDate=actBeginDate; 
      } 
      public Date getActEndDate(){ 
      	   return actEndDate;
      }
      public void setActEndDate(Date actEndDate){ 
      	   this.actEndDate=actEndDate; 
      } 
      public String getOwnerId(){ 
      	   return ownerId;
      }
      public void setOwnerId(String ownerId){ 
      	   this.ownerId=ownerId; 
      } 
      public String getLeaderId(){ 
      	   return leaderId;
      }
      public void setLeaderId(String leaderId){ 
      	   this.leaderId=leaderId; 
      } 
      public String getViewer(){ 
      	   return viewer;
      }
      public void setViewer(String viewer){ 
      	   this.viewer=viewer; 
      } 
      public String getUser(){ 
      	   return user;
      }
      public void setUser(String user){ 
      	   this.user=user; 
      } 
      public String getPriv(){ 
      	   return priv;
      }
      public void setPriv(String priv){ 
      	   this.priv=priv; 
      } 
      public String getMangerId(){ 
      	   return mangerId;
      }
      public void setMangerId(String mangerId){ 
      	   this.mangerId=mangerId; 
      } 
      public String getComment(){ 
      	   return comment;
      }
      public void setComment(String comment){ 
      	   this.comment=comment; 
      } 
      public Integer getStatus(){ 
      	   return status;
      }
      public void setStatus(Integer status){ 
      	   this.status=status; 
      } 
      public String getPercentComplete(){ 
      	   return percentComplete;
      }
      public void setPercentComplete(String percentComplete){ 
      	   this.percentComplete=percentComplete; 
      } 
      public String getCostType(){ 
      	   return costType;
      }
      public void setCostType(String costType){ 
      	   this.costType=costType; 
      } 
      public String getCostMoney(){ 
      	   return costMoney;
      }
      public void setCostMoney(String costMoney){ 
      	   this.costMoney=costMoney; 
      } 
      public String getApproveLog(){ 
      	   return approveLog;
      }
      public void setApproveLog(String approveLog){ 
      	   this.approveLog=approveLog; 
      } 
      public String getAttachmentId(){ 
      	   return attachmentId;
      }
      public void setAttachmentId(String attachmentId){ 
      	   this.attachmentId=attachmentId; 
      } 
      public String getAttachmentName(){ 
      	   return attachmentName;
      }
      public void setAttachmentName(String attachmentName){ 
      	   this.attachmentName=attachmentName; 
      } 
      public String getCreatorId(){ 
      	   return creatorId;
      }
      public void setCreatorId(String creatorId){ 
      	   this.creatorId=creatorId; 
      } 
      public String getCustomerId(){ 
      	   return customerId;
      }
      public void setCustomerId(String customerId){ 
      	   this.customerId=customerId; 
      } 
}