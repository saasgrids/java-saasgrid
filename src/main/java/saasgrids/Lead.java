/*
 * Saasgrids CRM grid
 * Saasgrids CRM grid
 *
 * OpenAPI spec version: 1.0.0
 * Contact: hello@saasgrids.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package saasgrids;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import saasgrids.Customfield;

/**
 * Lead
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T10:40:37.504+05:30")
public class Lead {
  @SerializedName("id")
  private String id = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("job_title")
  private String jobTitle = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("work_number")
  private String workNumber = null;

  @SerializedName("mobile_number")
  private String mobileNumber = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zipcode")
  private String zipcode = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("owner_id")
  private String ownerId = null;

  @SerializedName("do_not_disturb")
  private Boolean doNotDisturb = null;

  @SerializedName("medium")
  private String medium = null;

  @SerializedName("time_zone")
  private String timeZone = null;

  @SerializedName("facebook")
  private String facebook = null;

  @SerializedName("twitter")
  private String twitter = null;

  @SerializedName("linkedin")
  private String linkedin = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("company_address")
  private String companyAddress = null;

  @SerializedName("company_city")
  private String companyCity = null;

  @SerializedName("company_state")
  private String companyState = null;

  @SerializedName("company_zipcode")
  private String companyZipcode = null;

  @SerializedName("company_country")
  private String companyCountry = null;

  @SerializedName("company_number_of_employees")
  private Integer companyNumberOfEmployees = null;

  @SerializedName("company_annual_revenue")
  private Integer companyAnnualRevenue = null;

  @SerializedName("company_website")
  private String companyWebsite = null;

  @SerializedName("company_phone")
  private String companyPhone = null;

  @SerializedName("deal_name")
  private String dealName = null;

  @SerializedName("deal_amount")
  private Double dealAmount = null;

  @SerializedName("deal_expected_close")
  private LocalDate dealExpectedClose = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("custom_fields")
  private List<Customfield> customFields = null;

  public Lead id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Lead firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Lead lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Lead jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public Lead department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Lead email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Lead workNumber(String workNumber) {
    this.workNumber = workNumber;
    return this;
  }

   /**
   * Get workNumber
   * @return workNumber
  **/
  @ApiModelProperty(value = "")
  public String getWorkNumber() {
    return workNumber;
  }

  public void setWorkNumber(String workNumber) {
    this.workNumber = workNumber;
  }

  public Lead mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public Lead address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Lead city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Lead state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Lead zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

   /**
   * Get zipcode
   * @return zipcode
  **/
  @ApiModelProperty(value = "")
  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public Lead country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Lead ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public Lead doNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
    return this;
  }

   /**
   * Get doNotDisturb
   * @return doNotDisturb
  **/
  @ApiModelProperty(value = "")
  public Boolean getDoNotDisturb() {
    return doNotDisturb;
  }

  public void setDoNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
  }

  public Lead medium(String medium) {
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @ApiModelProperty(value = "")
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public Lead timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Lead facebook(String facebook) {
    this.facebook = facebook;
    return this;
  }

   /**
   * Get facebook
   * @return facebook
  **/
  @ApiModelProperty(value = "")
  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  public Lead twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

   /**
   * Get twitter
   * @return twitter
  **/
  @ApiModelProperty(value = "")
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public Lead linkedin(String linkedin) {
    this.linkedin = linkedin;
    return this;
  }

   /**
   * Get linkedin
   * @return linkedin
  **/
  @ApiModelProperty(value = "")
  public String getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }

  public Lead companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Lead companyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
    return this;
  }

   /**
   * Get companyAddress
   * @return companyAddress
  **/
  @ApiModelProperty(value = "")
  public String getCompanyAddress() {
    return companyAddress;
  }

  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

  public Lead companyCity(String companyCity) {
    this.companyCity = companyCity;
    return this;
  }

   /**
   * Get companyCity
   * @return companyCity
  **/
  @ApiModelProperty(value = "")
  public String getCompanyCity() {
    return companyCity;
  }

  public void setCompanyCity(String companyCity) {
    this.companyCity = companyCity;
  }

  public Lead companyState(String companyState) {
    this.companyState = companyState;
    return this;
  }

   /**
   * Get companyState
   * @return companyState
  **/
  @ApiModelProperty(value = "")
  public String getCompanyState() {
    return companyState;
  }

  public void setCompanyState(String companyState) {
    this.companyState = companyState;
  }

  public Lead companyZipcode(String companyZipcode) {
    this.companyZipcode = companyZipcode;
    return this;
  }

   /**
   * Get companyZipcode
   * @return companyZipcode
  **/
  @ApiModelProperty(value = "")
  public String getCompanyZipcode() {
    return companyZipcode;
  }

  public void setCompanyZipcode(String companyZipcode) {
    this.companyZipcode = companyZipcode;
  }

  public Lead companyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
    return this;
  }

   /**
   * Get companyCountry
   * @return companyCountry
  **/
  @ApiModelProperty(value = "")
  public String getCompanyCountry() {
    return companyCountry;
  }

  public void setCompanyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
  }

  public Lead companyNumberOfEmployees(Integer companyNumberOfEmployees) {
    this.companyNumberOfEmployees = companyNumberOfEmployees;
    return this;
  }

   /**
   * Get companyNumberOfEmployees
   * @return companyNumberOfEmployees
  **/
  @ApiModelProperty(value = "")
  public Integer getCompanyNumberOfEmployees() {
    return companyNumberOfEmployees;
  }

  public void setCompanyNumberOfEmployees(Integer companyNumberOfEmployees) {
    this.companyNumberOfEmployees = companyNumberOfEmployees;
  }

  public Lead companyAnnualRevenue(Integer companyAnnualRevenue) {
    this.companyAnnualRevenue = companyAnnualRevenue;
    return this;
  }

   /**
   * Get companyAnnualRevenue
   * @return companyAnnualRevenue
  **/
  @ApiModelProperty(value = "")
  public Integer getCompanyAnnualRevenue() {
    return companyAnnualRevenue;
  }

  public void setCompanyAnnualRevenue(Integer companyAnnualRevenue) {
    this.companyAnnualRevenue = companyAnnualRevenue;
  }

  public Lead companyWebsite(String companyWebsite) {
    this.companyWebsite = companyWebsite;
    return this;
  }

   /**
   * Get companyWebsite
   * @return companyWebsite
  **/
  @ApiModelProperty(value = "")
  public String getCompanyWebsite() {
    return companyWebsite;
  }

  public void setCompanyWebsite(String companyWebsite) {
    this.companyWebsite = companyWebsite;
  }

  public Lead companyPhone(String companyPhone) {
    this.companyPhone = companyPhone;
    return this;
  }

   /**
   * Get companyPhone
   * @return companyPhone
  **/
  @ApiModelProperty(value = "")
  public String getCompanyPhone() {
    return companyPhone;
  }

  public void setCompanyPhone(String companyPhone) {
    this.companyPhone = companyPhone;
  }

  public Lead dealName(String dealName) {
    this.dealName = dealName;
    return this;
  }

   /**
   * Get dealName
   * @return dealName
  **/
  @ApiModelProperty(value = "")
  public String getDealName() {
    return dealName;
  }

  public void setDealName(String dealName) {
    this.dealName = dealName;
  }

  public Lead dealAmount(Double dealAmount) {
    this.dealAmount = dealAmount;
    return this;
  }

   /**
   * Get dealAmount
   * @return dealAmount
  **/
  @ApiModelProperty(value = "")
  public Double getDealAmount() {
    return dealAmount;
  }

  public void setDealAmount(Double dealAmount) {
    this.dealAmount = dealAmount;
  }

  public Lead dealExpectedClose(LocalDate dealExpectedClose) {
    this.dealExpectedClose = dealExpectedClose;
    return this;
  }

   /**
   * Get dealExpectedClose
   * @return dealExpectedClose
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDealExpectedClose() {
    return dealExpectedClose;
  }

  public void setDealExpectedClose(LocalDate dealExpectedClose) {
    this.dealExpectedClose = dealExpectedClose;
  }

  public Lead createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Lead updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Lead customFields(List<Customfield> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Lead addCustomFieldsItem(Customfield customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<Customfield>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public List<Customfield> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<Customfield> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lead lead = (Lead) o;
    return Objects.equals(this.id, lead.id) &&
        Objects.equals(this.firstName, lead.firstName) &&
        Objects.equals(this.lastName, lead.lastName) &&
        Objects.equals(this.jobTitle, lead.jobTitle) &&
        Objects.equals(this.department, lead.department) &&
        Objects.equals(this.email, lead.email) &&
        Objects.equals(this.workNumber, lead.workNumber) &&
        Objects.equals(this.mobileNumber, lead.mobileNumber) &&
        Objects.equals(this.address, lead.address) &&
        Objects.equals(this.city, lead.city) &&
        Objects.equals(this.state, lead.state) &&
        Objects.equals(this.zipcode, lead.zipcode) &&
        Objects.equals(this.country, lead.country) &&
        Objects.equals(this.ownerId, lead.ownerId) &&
        Objects.equals(this.doNotDisturb, lead.doNotDisturb) &&
        Objects.equals(this.medium, lead.medium) &&
        Objects.equals(this.timeZone, lead.timeZone) &&
        Objects.equals(this.facebook, lead.facebook) &&
        Objects.equals(this.twitter, lead.twitter) &&
        Objects.equals(this.linkedin, lead.linkedin) &&
        Objects.equals(this.companyName, lead.companyName) &&
        Objects.equals(this.companyAddress, lead.companyAddress) &&
        Objects.equals(this.companyCity, lead.companyCity) &&
        Objects.equals(this.companyState, lead.companyState) &&
        Objects.equals(this.companyZipcode, lead.companyZipcode) &&
        Objects.equals(this.companyCountry, lead.companyCountry) &&
        Objects.equals(this.companyNumberOfEmployees, lead.companyNumberOfEmployees) &&
        Objects.equals(this.companyAnnualRevenue, lead.companyAnnualRevenue) &&
        Objects.equals(this.companyWebsite, lead.companyWebsite) &&
        Objects.equals(this.companyPhone, lead.companyPhone) &&
        Objects.equals(this.dealName, lead.dealName) &&
        Objects.equals(this.dealAmount, lead.dealAmount) &&
        Objects.equals(this.dealExpectedClose, lead.dealExpectedClose) &&
        Objects.equals(this.createdAt, lead.createdAt) &&
        Objects.equals(this.updatedAt, lead.updatedAt) &&
        Objects.equals(this.customFields, lead.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, jobTitle, department, email, workNumber, mobileNumber, address, city, state, zipcode, country, ownerId, doNotDisturb, medium, timeZone, facebook, twitter, linkedin, companyName, companyAddress, companyCity, companyState, companyZipcode, companyCountry, companyNumberOfEmployees, companyAnnualRevenue, companyWebsite, companyPhone, dealName, dealAmount, dealExpectedClose, createdAt, updatedAt, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lead {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    workNumber: ").append(toIndentedString(workNumber)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    doNotDisturb: ").append(toIndentedString(doNotDisturb)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyAddress: ").append(toIndentedString(companyAddress)).append("\n");
    sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
    sb.append("    companyState: ").append(toIndentedString(companyState)).append("\n");
    sb.append("    companyZipcode: ").append(toIndentedString(companyZipcode)).append("\n");
    sb.append("    companyCountry: ").append(toIndentedString(companyCountry)).append("\n");
    sb.append("    companyNumberOfEmployees: ").append(toIndentedString(companyNumberOfEmployees)).append("\n");
    sb.append("    companyAnnualRevenue: ").append(toIndentedString(companyAnnualRevenue)).append("\n");
    sb.append("    companyWebsite: ").append(toIndentedString(companyWebsite)).append("\n");
    sb.append("    companyPhone: ").append(toIndentedString(companyPhone)).append("\n");
    sb.append("    dealName: ").append(toIndentedString(dealName)).append("\n");
    sb.append("    dealAmount: ").append(toIndentedString(dealAmount)).append("\n");
    sb.append("    dealExpectedClose: ").append(toIndentedString(dealExpectedClose)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

