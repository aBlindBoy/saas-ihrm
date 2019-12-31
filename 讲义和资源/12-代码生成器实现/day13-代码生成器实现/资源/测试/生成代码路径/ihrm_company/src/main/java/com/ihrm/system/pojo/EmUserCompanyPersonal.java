package com.ihrm.system.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "em_user_company_personal")
public class EmUserCompanyPersonal implements Serializable {

    @Id
    private String userId;
    private String username;
    private String mobile;
    private String timeOfEntry;
    private String departmentName;
    private String companyId;
    private String sex;
    private String dateOfBirth;
    private String theHighestDegreeOfEducation;
    private String nationalArea;
    private String passportNo;
    private String idNumber;
    private String idCardPhotoPositive;
    private String idCardPhotoBack;
    private String nativePlace;
    private String nation;
    private String englishName;
    private String maritalStatus;
    private String staffPhoto;
    private String birthday;
    private String zodiac;
    private String age;
    private String constellation;
    private String bloodType;
    private String domicile;
    private String politicalOutlook;
    private String timeToJoinTheParty;
    private String archivingOrganization;
    private String stateOfChildren;
    private String doChildrenHaveCommercialInsurance;
    private String isThereAnyViolationOfLawOrDiscipline;
    private String areThereAnyMajorMedicalHistories;
    private String qq;
    private String wechat;
    private String residenceCardCity;
    private String dateOfResidencePermit;
    private String residencePermitDeadline;
    private String placeOfResidence;
    private String postalAddress;
    private String contactTheMobilePhone;
    private String personalMailbox;
    private String emergencyContact;
    private String emergencyContactNumber;
    private String socialSecurityComputerNumber;
    private String providentFundAccount;
    private String bankCardNumber;
    private String openingBank;
    private String educationalType;
    private String graduateSchool;
    private String enrolmentTime;
    private String graduationTime;
    private String major;
    private String graduationCertificate;
    private String certificateOfAcademicDegree;
    private String homeCompany;
    private String title;
    private String resume;
    private String isThereAnyCompetitionRestriction;
    private String proofOfDepartureOfFormerCompany;
    private String remarks;

    public void setUserId(String value) {
        this.userId = value
    }
    public String getUserId() {
       return this.userId
    }
    public void setUsername(String value) {
        this.username = value
    }
    public String getUsername() {
       return this.username
    }
    public void setMobile(String value) {
        this.mobile = value
    }
    public String getMobile() {
       return this.mobile
    }
    public void setTimeOfEntry(String value) {
        this.timeOfEntry = value
    }
    public String getTimeOfEntry() {
       return this.timeOfEntry
    }
    public void setDepartmentName(String value) {
        this.departmentName = value
    }
    public String getDepartmentName() {
       return this.departmentName
    }
    public void setCompanyId(String value) {
        this.companyId = value
    }
    public String getCompanyId() {
       return this.companyId
    }
    public void setSex(String value) {
        this.sex = value
    }
    public String getSex() {
       return this.sex
    }
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value
    }
    public String getDateOfBirth() {
       return this.dateOfBirth
    }
    public void setTheHighestDegreeOfEducation(String value) {
        this.theHighestDegreeOfEducation = value
    }
    public String getTheHighestDegreeOfEducation() {
       return this.theHighestDegreeOfEducation
    }
    public void setNationalArea(String value) {
        this.nationalArea = value
    }
    public String getNationalArea() {
       return this.nationalArea
    }
    public void setPassportNo(String value) {
        this.passportNo = value
    }
    public String getPassportNo() {
       return this.passportNo
    }
    public void setIdNumber(String value) {
        this.idNumber = value
    }
    public String getIdNumber() {
       return this.idNumber
    }
    public void setIdCardPhotoPositive(String value) {
        this.idCardPhotoPositive = value
    }
    public String getIdCardPhotoPositive() {
       return this.idCardPhotoPositive
    }
    public void setIdCardPhotoBack(String value) {
        this.idCardPhotoBack = value
    }
    public String getIdCardPhotoBack() {
       return this.idCardPhotoBack
    }
    public void setNativePlace(String value) {
        this.nativePlace = value
    }
    public String getNativePlace() {
       return this.nativePlace
    }
    public void setNation(String value) {
        this.nation = value
    }
    public String getNation() {
       return this.nation
    }
    public void setEnglishName(String value) {
        this.englishName = value
    }
    public String getEnglishName() {
       return this.englishName
    }
    public void setMaritalStatus(String value) {
        this.maritalStatus = value
    }
    public String getMaritalStatus() {
       return this.maritalStatus
    }
    public void setStaffPhoto(String value) {
        this.staffPhoto = value
    }
    public String getStaffPhoto() {
       return this.staffPhoto
    }
    public void setBirthday(String value) {
        this.birthday = value
    }
    public String getBirthday() {
       return this.birthday
    }
    public void setZodiac(String value) {
        this.zodiac = value
    }
    public String getZodiac() {
       return this.zodiac
    }
    public void setAge(String value) {
        this.age = value
    }
    public String getAge() {
       return this.age
    }
    public void setConstellation(String value) {
        this.constellation = value
    }
    public String getConstellation() {
       return this.constellation
    }
    public void setBloodType(String value) {
        this.bloodType = value
    }
    public String getBloodType() {
       return this.bloodType
    }
    public void setDomicile(String value) {
        this.domicile = value
    }
    public String getDomicile() {
       return this.domicile
    }
    public void setPoliticalOutlook(String value) {
        this.politicalOutlook = value
    }
    public String getPoliticalOutlook() {
       return this.politicalOutlook
    }
    public void setTimeToJoinTheParty(String value) {
        this.timeToJoinTheParty = value
    }
    public String getTimeToJoinTheParty() {
       return this.timeToJoinTheParty
    }
    public void setArchivingOrganization(String value) {
        this.archivingOrganization = value
    }
    public String getArchivingOrganization() {
       return this.archivingOrganization
    }
    public void setStateOfChildren(String value) {
        this.stateOfChildren = value
    }
    public String getStateOfChildren() {
       return this.stateOfChildren
    }
    public void setDoChildrenHaveCommercialInsurance(String value) {
        this.doChildrenHaveCommercialInsurance = value
    }
    public String getDoChildrenHaveCommercialInsurance() {
       return this.doChildrenHaveCommercialInsurance
    }
    public void setIsThereAnyViolationOfLawOrDiscipline(String value) {
        this.isThereAnyViolationOfLawOrDiscipline = value
    }
    public String getIsThereAnyViolationOfLawOrDiscipline() {
       return this.isThereAnyViolationOfLawOrDiscipline
    }
    public void setAreThereAnyMajorMedicalHistories(String value) {
        this.areThereAnyMajorMedicalHistories = value
    }
    public String getAreThereAnyMajorMedicalHistories() {
       return this.areThereAnyMajorMedicalHistories
    }
    public void setQq(String value) {
        this.qq = value
    }
    public String getQq() {
       return this.qq
    }
    public void setWechat(String value) {
        this.wechat = value
    }
    public String getWechat() {
       return this.wechat
    }
    public void setResidenceCardCity(String value) {
        this.residenceCardCity = value
    }
    public String getResidenceCardCity() {
       return this.residenceCardCity
    }
    public void setDateOfResidencePermit(String value) {
        this.dateOfResidencePermit = value
    }
    public String getDateOfResidencePermit() {
       return this.dateOfResidencePermit
    }
    public void setResidencePermitDeadline(String value) {
        this.residencePermitDeadline = value
    }
    public String getResidencePermitDeadline() {
       return this.residencePermitDeadline
    }
    public void setPlaceOfResidence(String value) {
        this.placeOfResidence = value
    }
    public String getPlaceOfResidence() {
       return this.placeOfResidence
    }
    public void setPostalAddress(String value) {
        this.postalAddress = value
    }
    public String getPostalAddress() {
       return this.postalAddress
    }
    public void setContactTheMobilePhone(String value) {
        this.contactTheMobilePhone = value
    }
    public String getContactTheMobilePhone() {
       return this.contactTheMobilePhone
    }
    public void setPersonalMailbox(String value) {
        this.personalMailbox = value
    }
    public String getPersonalMailbox() {
       return this.personalMailbox
    }
    public void setEmergencyContact(String value) {
        this.emergencyContact = value
    }
    public String getEmergencyContact() {
       return this.emergencyContact
    }
    public void setEmergencyContactNumber(String value) {
        this.emergencyContactNumber = value
    }
    public String getEmergencyContactNumber() {
       return this.emergencyContactNumber
    }
    public void setSocialSecurityComputerNumber(String value) {
        this.socialSecurityComputerNumber = value
    }
    public String getSocialSecurityComputerNumber() {
       return this.socialSecurityComputerNumber
    }
    public void setProvidentFundAccount(String value) {
        this.providentFundAccount = value
    }
    public String getProvidentFundAccount() {
       return this.providentFundAccount
    }
    public void setBankCardNumber(String value) {
        this.bankCardNumber = value
    }
    public String getBankCardNumber() {
       return this.bankCardNumber
    }
    public void setOpeningBank(String value) {
        this.openingBank = value
    }
    public String getOpeningBank() {
       return this.openingBank
    }
    public void setEducationalType(String value) {
        this.educationalType = value
    }
    public String getEducationalType() {
       return this.educationalType
    }
    public void setGraduateSchool(String value) {
        this.graduateSchool = value
    }
    public String getGraduateSchool() {
       return this.graduateSchool
    }
    public void setEnrolmentTime(String value) {
        this.enrolmentTime = value
    }
    public String getEnrolmentTime() {
       return this.enrolmentTime
    }
    public void setGraduationTime(String value) {
        this.graduationTime = value
    }
    public String getGraduationTime() {
       return this.graduationTime
    }
    public void setMajor(String value) {
        this.major = value
    }
    public String getMajor() {
       return this.major
    }
    public void setGraduationCertificate(String value) {
        this.graduationCertificate = value
    }
    public String getGraduationCertificate() {
       return this.graduationCertificate
    }
    public void setCertificateOfAcademicDegree(String value) {
        this.certificateOfAcademicDegree = value
    }
    public String getCertificateOfAcademicDegree() {
       return this.certificateOfAcademicDegree
    }
    public void setHomeCompany(String value) {
        this.homeCompany = value
    }
    public String getHomeCompany() {
       return this.homeCompany
    }
    public void setTitle(String value) {
        this.title = value
    }
    public String getTitle() {
       return this.title
    }
    public void setResume(String value) {
        this.resume = value
    }
    public String getResume() {
       return this.resume
    }
    public void setIsThereAnyCompetitionRestriction(String value) {
        this.isThereAnyCompetitionRestriction = value
    }
    public String getIsThereAnyCompetitionRestriction() {
       return this.isThereAnyCompetitionRestriction
    }
    public void setProofOfDepartureOfFormerCompany(String value) {
        this.proofOfDepartureOfFormerCompany = value
    }
    public String getProofOfDepartureOfFormerCompany() {
       return this.proofOfDepartureOfFormerCompany
    }
    public void setRemarks(String value) {
        this.remarks = value
    }
    public String getRemarks() {
       return this.remarks
    }
}
