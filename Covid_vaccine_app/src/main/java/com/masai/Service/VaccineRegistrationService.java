package com.masai.Service;

import java.util.List;

import com.masai.model.Member;
import com.masai.model.VaccineRegistration;

public interface VaccineRegistrationService {

	public List<VaccineRegistration> allVaccineRegistration();

	public VaccineRegistration getVaccineRegistration(Long long1,String key);

	public List<Member> getAllMember(String mobileNo,String key);

	public VaccineRegistration addVaccineRegistration(String mobNo,String key);

	public VaccineRegistration updateVaccineRegistration(String mobNo, String newMobNo,String key);

	public boolean deleteVaccineRegistration(String mobNo,String key);

	

	

}
