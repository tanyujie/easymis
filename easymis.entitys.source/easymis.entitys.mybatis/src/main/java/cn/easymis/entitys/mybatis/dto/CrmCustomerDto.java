package cn.easymis.entitys.mybatis.dto;
import java.io.Serializable; 
import cn.easymis.commons.code.util.annotation.GenField; 
import cn.easymis.commons.code.util.annotation.GenModel; 
import cn.easymis.commons.code.util.annotation.GenTable; 
import java.util.*; 
 
  
  
 @GenTable(name="crm_customer") 
@GenModel(packageName="cn.easymis.entitys.mybatis",modelName="CrmCustomer")  
 public class CrmCustomerDto implements Serializable{  
      @GenField(labelname="客户id",column="customer_id",id=true,length=20,isnull=false) 
      private String customerId; 
      @GenField(labelname="组织机构代码",column="org_id",length=45,isnull=false) 
      private String orgId; 
      @GenField(labelname="分公司代码",column="company_id",length=45,isnull=true) 
      private String companyId; 
      @GenField(labelname="所有者岗位",column="owner_id",length=45,isnull=true) 
      private String ownerId; 
      @GenField(labelname="创建者id",column="creator_id",length=45,isnull=false) 
      private String creatorId; 
      @GenField(labelname="首要联系人",column="contacts_id",length=45,isnull=true) 
      private String contactsId; 
      @GenField(labelname="企业名称",column="customer_name",length=333,isnull=true) 
      private String customerName; 
      @GenField(labelname="客户信息来源",column="origin_id",length=150,isnull=true) 
      private String originId; 
      @GenField(labelname="客户联系地址[街道信息]",column="street",length=100,isnull=true) 
      private String street; 
      @GenField(labelname="邮编",column="zip_Code",length=20,isnull=true) 
      private String zipCode; 
      @GenField(labelname="行业",column="level1_Industry_id",length=150,isnull=true) 
      private String level1IndustryId; 
      @GenField(labelname="年营业额",column="annual_Revenue",length=45,isnull=true) 
      private String annualRevenue; 
      @GenField(labelname="企业类型(1合资,2国企,3民营)",column="ownership",length=20,isnull=true) 
      private String ownership; 
      @GenField(labelname="",column="rating",length=150,isnull=true) 
      private String rating; 
      @GenField(labelname="建立时间",column="create_Time",isnull=false) 
      private Date createTime; 
      @GenField(labelname="更新时间",column="update_Time",isnull=true) 
      private Date updateTime; 
      @GenField(labelname="是否删除1已删除",column="deleted",isnull=true) 
      private Integer deleted; 
      @GenField(labelname="是否锁定1锁定",column="locked",isnull=true) 
      private Integer locked; 
      @GenField(labelname="删除人",column="delete_id",length=20,isnull=true) 
      private String deleteId; 
      @GenField(labelname="删除时间",column="delete_Time",isnull=true) 
      private Date deleteTime; 
      @GenField(labelname="所属国家-------",column="country_id",length=45,isnull=true) 
      private String countryId; 
      @GenField(labelname="所属省份",column="province_id",length=45,isnull=true) 
      private String provinceId; 
      @GenField(labelname="所属城市",column="city_id",length=45,isnull=true) 
      private String cityId; 
      @GenField(labelname="企业执照号",column="business_License_No",length=45,isnull=true) 
      private String businessLicenseNo; 
      @GenField(labelname="企业法人",column="legal_Person",length=45,isnull=true) 
      private String legalPerson; 
      @GenField(labelname="注册资本",column="registered_Capital",length=45,isnull=true) 
      private String registeredCapital; 
      @GenField(labelname="经营范围",column="business_Scope",length=45,isnull=true) 
      private String businessScope; 
      @GenField(labelname="联系电话",column="phone",length=45,isnull=true) 
      private String phone; 
      @GenField(labelname="电子邮箱",column="email",length=45,isnull=true) 
      private String email; 
      @GenField(labelname="企业qq",column="qq",length=45,isnull=true) 
      private String qq; 
      @GenField(labelname="是否上市",column="ipo",isnull=true) 
      private Integer ipo; 
      @GenField(labelname="股票代码",column="stock_Code",length=45,isnull=true) 
      private String stockCode; 
      @GenField(labelname="企业编码",column="code",length=45,isnull=true) 
      private String code; 
      @GenField(labelname="行业2级",column="level2_Industry_id",length=45,isnull=true) 
      private String level2IndustryId; 
      @GenField(labelname="行业3级",column="level3_Industry_id",length=45,isnull=true) 
      private String level3IndustryId; 
      @GenField(labelname="行业4级",column="level4_Industry_id",length=45,isnull=true) 
      private String level4IndustryId; 
      @GenField(labelname="税号",column="tax_No",length=45,isnull=true) 
      private String taxNo; 
      @GenField(labelname="银行账号",column="bank_No",length=45,isnull=true) 
      private String bankNo; 
      @GenField(labelname="开户行",column="bankName",length=60,isnull=true) 
      private String bankName; 
      @GenField(labelname="级别:1A(重点客户),B(普通客户),C(非优先客户)",column="category_id",length=45,isnull=true) 
      private String categoryId; 
      @GenField(labelname="区",column="district_id",length=45,isnull=true) 
      private String districtId; 
      @GenField(labelname="网站",column="url",length=45,isnull=true) 
      private String url; 
      @GenField(labelname="博客",column="blog",length=45,isnull=true) 
      private String blog; 
      @GenField(labelname="传真",column="fax",length=45,isnull=true) 
      private String fax; 
      @GenField(labelname="备注",column="depict",length=45,isnull=true) 
      private String depict; 
      @GenField(labelname="总人数",column="headcount",length=45,isnull=true) 
      private String headcount; 
      public String getCustomerId(){ 
      	   return customerId;
      }
      public void setCustomerId(String customerId){ 
      	   this.customerId=customerId; 
      } 
      public String getOrgId(){ 
      	   return orgId;
      }
      public void setOrgId(String orgId){ 
      	   this.orgId=orgId; 
      } 
      public String getCompanyId(){ 
      	   return companyId;
      }
      public void setCompanyId(String companyId){ 
      	   this.companyId=companyId; 
      } 
      public String getOwnerId(){ 
      	   return ownerId;
      }
      public void setOwnerId(String ownerId){ 
      	   this.ownerId=ownerId; 
      } 
      public String getCreatorId(){ 
      	   return creatorId;
      }
      public void setCreatorId(String creatorId){ 
      	   this.creatorId=creatorId; 
      } 
      public String getContactsId(){ 
      	   return contactsId;
      }
      public void setContactsId(String contactsId){ 
      	   this.contactsId=contactsId; 
      } 
      public String getCustomerName(){ 
      	   return customerName;
      }
      public void setCustomerName(String customerName){ 
      	   this.customerName=customerName; 
      } 
      public String getOriginId(){ 
      	   return originId;
      }
      public void setOriginId(String originId){ 
      	   this.originId=originId; 
      } 
      public String getStreet(){ 
      	   return street;
      }
      public void setStreet(String street){ 
      	   this.street=street; 
      } 
      public String getZipCode(){ 
      	   return zipCode;
      }
      public void setZipCode(String zipCode){ 
      	   this.zipCode=zipCode; 
      } 
      public String getLevel1IndustryId(){ 
      	   return level1IndustryId;
      }
      public void setLevel1IndustryId(String level1IndustryId){ 
      	   this.level1IndustryId=level1IndustryId; 
      } 
      public String getAnnualRevenue(){ 
      	   return annualRevenue;
      }
      public void setAnnualRevenue(String annualRevenue){ 
      	   this.annualRevenue=annualRevenue; 
      } 
      public String getOwnership(){ 
      	   return ownership;
      }
      public void setOwnership(String ownership){ 
      	   this.ownership=ownership; 
      } 
      public String getRating(){ 
      	   return rating;
      }
      public void setRating(String rating){ 
      	   this.rating=rating; 
      } 
      public Date getCreateTime(){ 
      	   return createTime;
      }
      public void setCreateTime(Date createTime){ 
      	   this.createTime=createTime; 
      } 
      public Date getUpdateTime(){ 
      	   return updateTime;
      }
      public void setUpdateTime(Date updateTime){ 
      	   this.updateTime=updateTime; 
      } 
      public Integer getDeleted(){ 
      	   return deleted;
      }
      public void setDeleted(Integer deleted){ 
      	   this.deleted=deleted; 
      } 
      public Integer getLocked(){ 
      	   return locked;
      }
      public void setLocked(Integer locked){ 
      	   this.locked=locked; 
      } 
      public String getDeleteId(){ 
      	   return deleteId;
      }
      public void setDeleteId(String deleteId){ 
      	   this.deleteId=deleteId; 
      } 
      public Date getDeleteTime(){ 
      	   return deleteTime;
      }
      public void setDeleteTime(Date deleteTime){ 
      	   this.deleteTime=deleteTime; 
      } 
      public String getCountryId(){ 
      	   return countryId;
      }
      public void setCountryId(String countryId){ 
      	   this.countryId=countryId; 
      } 
      public String getProvinceId(){ 
      	   return provinceId;
      }
      public void setProvinceId(String provinceId){ 
      	   this.provinceId=provinceId; 
      } 
      public String getCityId(){ 
      	   return cityId;
      }
      public void setCityId(String cityId){ 
      	   this.cityId=cityId; 
      } 
      public String getBusinessLicenseNo(){ 
      	   return businessLicenseNo;
      }
      public void setBusinessLicenseNo(String businessLicenseNo){ 
      	   this.businessLicenseNo=businessLicenseNo; 
      } 
      public String getLegalPerson(){ 
      	   return legalPerson;
      }
      public void setLegalPerson(String legalPerson){ 
      	   this.legalPerson=legalPerson; 
      } 
      public String getRegisteredCapital(){ 
      	   return registeredCapital;
      }
      public void setRegisteredCapital(String registeredCapital){ 
      	   this.registeredCapital=registeredCapital; 
      } 
      public String getBusinessScope(){ 
      	   return businessScope;
      }
      public void setBusinessScope(String businessScope){ 
      	   this.businessScope=businessScope; 
      } 
      public String getPhone(){ 
      	   return phone;
      }
      public void setPhone(String phone){ 
      	   this.phone=phone; 
      } 
      public String getEmail(){ 
      	   return email;
      }
      public void setEmail(String email){ 
      	   this.email=email; 
      } 
      public String getQq(){ 
      	   return qq;
      }
      public void setQq(String qq){ 
      	   this.qq=qq; 
      } 
      public Integer getIpo(){ 
      	   return ipo;
      }
      public void setIpo(Integer ipo){ 
      	   this.ipo=ipo; 
      } 
      public String getStockCode(){ 
      	   return stockCode;
      }
      public void setStockCode(String stockCode){ 
      	   this.stockCode=stockCode; 
      } 
      public String getCode(){ 
      	   return code;
      }
      public void setCode(String code){ 
      	   this.code=code; 
      } 
      public String getLevel2IndustryId(){ 
      	   return level2IndustryId;
      }
      public void setLevel2IndustryId(String level2IndustryId){ 
      	   this.level2IndustryId=level2IndustryId; 
      } 
      public String getLevel3IndustryId(){ 
      	   return level3IndustryId;
      }
      public void setLevel3IndustryId(String level3IndustryId){ 
      	   this.level3IndustryId=level3IndustryId; 
      } 
      public String getLevel4IndustryId(){ 
      	   return level4IndustryId;
      }
      public void setLevel4IndustryId(String level4IndustryId){ 
      	   this.level4IndustryId=level4IndustryId; 
      } 
      public String getTaxNo(){ 
      	   return taxNo;
      }
      public void setTaxNo(String taxNo){ 
      	   this.taxNo=taxNo; 
      } 
      public String getBankNo(){ 
      	   return bankNo;
      }
      public void setBankNo(String bankNo){ 
      	   this.bankNo=bankNo; 
      } 
      public String getBankName(){ 
      	   return bankName;
      }
      public void setBankName(String bankName){ 
      	   this.bankName=bankName; 
      } 
      public String getCategoryId(){ 
      	   return categoryId;
      }
      public void setCategoryId(String categoryId){ 
      	   this.categoryId=categoryId; 
      } 
      public String getDistrictId(){ 
      	   return districtId;
      }
      public void setDistrictId(String districtId){ 
      	   this.districtId=districtId; 
      } 
      public String getUrl(){ 
      	   return url;
      }
      public void setUrl(String url){ 
      	   this.url=url; 
      } 
      public String getBlog(){ 
      	   return blog;
      }
      public void setBlog(String blog){ 
      	   this.blog=blog; 
      } 
      public String getFax(){ 
      	   return fax;
      }
      public void setFax(String fax){ 
      	   this.fax=fax; 
      } 
      public String getDepict(){ 
      	   return depict;
      }
      public void setDepict(String depict){ 
      	   this.depict=depict; 
      } 
      public String getHeadcount(){ 
      	   return headcount;
      }
      public void setHeadcount(String headcount){ 
      	   this.headcount=headcount; 
      } 
}