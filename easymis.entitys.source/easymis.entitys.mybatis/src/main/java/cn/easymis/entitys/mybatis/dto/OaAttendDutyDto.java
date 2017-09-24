package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable;
import java.util.Date;

import cn.easymis.commons.code.util.annotation.GenField;
import cn.easymis.commons.code.util.annotation.GenModel;
import cn.easymis.commons.code.util.annotation.GenTable; 
 
  
  
 @GenTable(name="oa_attend_duty") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="OaAttendDuty")  
 public class OaAttendDutyDto implements Serializable{  
      @GenField(labelname="",column="attend_duty_id",id=true,length=20,isnull=false) 
      private String attendDutyId; 
      @GenField(labelname="组织编码",column="org_id",length=20,isnull=false) 
      private String orgId; 
      @GenField(labelname="登记人|员工Code",column="employee_id",length=50,isnull=false) 
      private String employeeId; 
      @GenField(labelname="第几次登记",column="register_count",isnull=true) 
      private Integer registerCount; 
      @GenField(labelname="登记时间|上班时间",column="register_time",isnull=false) 
      private Date registerTime; 
      @GenField(labelname="下班时间",column="end_time",isnull=true) 
      private Date endTime; 
      @GenField(labelname="登记IP",column="reg_ip",length=20,isnull=true) 
      private String regIp; 
      @GenField(labelname="登记说明",column="remark",length=65535,isnull=true) 
      private String remark; 
      @GenField(labelname="排班类型",column="duty_type",isnull=true) 
      private Integer dutyType; 
      @GenField(labelname="是否为手机登记",column="is_mobile",isnull=true) 
      private Integer isMobile; 
      @GenField(labelname="手机考勤ID",column="mobile_id",length=11,isnull=true) 
      private String mobileId; 
      @GenField(labelname="地理坐标经度",column="longitude",length=20,isnull=true) 
      private String longitude; 
      @GenField(labelname="地理坐标纬度",column="latitude",length=20,isnull=true) 
      private String latitude; 
      @GenField(labelname="定位地点名称",column="location",length=100,isnull=true) 
      private String location; 
      @GenField(labelname="省份",column="province",length=40,isnull=true) 
      private String province; 
      @GenField(labelname="是否为足迹",column="is_foot",isnull=true) 
      private Integer isFoot; 
      @GenField(labelname="附件ID串",column="attachmen_id",length=65535,isnull=true) 
      private String attachmenId; 
      @GenField(labelname="附件名称",column="attachment_name",length=65535,isnull=true) 
      private String attachmentName; 
      public String getAttendDutyId(){ 
      	   return attendDutyId;
      }
      public void setAttendDutyId(String attendDutyId){ 
      	   this.attendDutyId=attendDutyId; 
      } 
      public String getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(String orgId){ 
      	   this.orgId=orgId; 
      } 
      public String getEmployeeId(){ 
      	   return employeeId;
      }
      public void setEmployeeId(String employeeId){ 
      	   this.employeeId=employeeId; 
      } 
      public Integer getRegisterCount(){ 
      	   return registerCount;
      }
      public void setRegisterCount(Integer registerCount){ 
      	   this.registerCount=registerCount; 
      } 
      public Date getRegisterTime(){ 
      	   return registerTime;
      }
      public void setRegisterTime(Date registerTime){ 
      	   this.registerTime=registerTime; 
      } 
      public Date getEndTime(){ 
      	   return endTime;
      }
      public void setEndTime(Date endTime){ 
      	   this.endTime=endTime; 
      } 
      public String getRegIp(){ 
      	   return regIp;
      }
      public void setRegIp(String regIp){ 
      	   this.regIp=regIp; 
      } 
      public String getRemark(){ 
      	   return remark;
      }
      public void setRemark(String remark){ 
      	   this.remark=remark; 
      } 
      public Integer getDutyType(){ 
      	   return dutyType;
      }
      public void setDutyType(Integer dutyType){ 
      	   this.dutyType=dutyType; 
      } 
      public Integer getIsMobile(){ 
      	   return isMobile;
      }
      public void setIsMobile(Integer isMobile){ 
      	   this.isMobile=isMobile; 
      } 
      public String getMobileId(){ 
      	   return mobileId;
      }
      public void setMobileId(String mobileId){ 
      	   this.mobileId=mobileId; 
      } 
      public String getLongitude(){ 
      	   return longitude;
      }
      public void setLongitude(String longitude){ 
      	   this.longitude=longitude; 
      } 
      public String getLatitude(){ 
      	   return latitude;
      }
      public void setLatitude(String latitude){ 
      	   this.latitude=latitude; 
      } 
      public String getLocation(){ 
      	   return location;
      }
      public void setLocation(String location){ 
      	   this.location=location; 
      } 
      public String getProvince(){ 
      	   return province;
      }
      public void setProvince(String province){ 
      	   this.province=province; 
      } 
      public Integer getIsFoot(){ 
      	   return isFoot;
      }
      public void setIsFoot(Integer isFoot){ 
      	   this.isFoot=isFoot; 
      } 
      public String getAttachmenId(){ 
      	   return attachmenId;
      }
      public void setAttachmenId(String attachmenId){ 
      	   this.attachmenId=attachmenId; 
      } 
      public String getAttachmentName(){ 
      	   return attachmentName;
      }
      public void setAttachmentName(String attachmentName){ 
      	   this.attachmentName=attachmentName; 
      } 
}