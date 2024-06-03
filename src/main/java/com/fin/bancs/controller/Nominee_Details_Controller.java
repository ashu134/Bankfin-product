package com.fin.bancs.controller;

import com.fin.bancs.BP.Nominee_Details;
import com.fin.bancs.repository.Nominee_Repository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public class Nominee_Details_Controller {

    @Autowired
    private Nominee_Repository nomineeRepository;


	public Nominee_Details createModifyNomineeDetails(Nominee_Details nomineeDetails,int flag){
		//Flag=1-> Create
		//flag=2 -> Modify
		if(flag==2) {
			//check if customer exist then proceed else throw Error "Customer Not Exist"
			//need a methd t check the customer or in input required cust_id
		}
		
		Nominee_Details nominee_details = new Nominee_Details();
		nominee_details=nomineeDetails;
//		nominee_details.setNOMINEE_ID(999);
//		nominee_details.setOWNER_ID(nomineeDetails.getOWNER_ID());
//		nominee_details.setOWNER_TYPE(nomineeDetails.getOWNER_TYPE());
//		nominee_details.setNOM_ADD_ID(nomineeDetails.getNOM_ADD_ID());
//		nominee_details.setNOM_TYPE(nomineeDetails.getNOM_TYPE());
//		nominee_details.setNOM_TYPE_CODE(00000); //Add this After putting data in Golden_Codes
//		//nominee_details.setNOMINEE_FIRST_NAME(nomineeDetails.getNOMINEE_FIRST_NAME());
//		nominee_details.setNOMINEE_MIDDLE_NAME(nomineeDetails.getNOMINEE_MIDDLE_NAME());
//		nominee_details.setNOMINEE_LAST_NAME(nomineeDetails.getNOMINEE_LAST_NAME());
//		nominee_details.setRTLN_TYPE(nomineeDetails.getRTLN_TYPE());
//		nominee_details.setRTLN_TYPE_CODE(0000); //Add this After putting data in Golden_Codes
//		nominee_details.setDATE_OF_BIRTH(nomineeDetails.getDATE_OF_BIRTH());
//		nominee_details.setNOM_ADD_ID(999); //address details should also come as a input 
//		nominee_details.setNOM_DOC_ID(999); //Documents details should also come as a input
//		//Need to call 2 task Address creation and Document Creation task here 
		int nomineee_id=1;
		//nomineeRepository.findBy(null, null);
		if(flag==1) {
		Nominee_Details nominee_detail = nomineeRepository.save(nomineeDetails);
		}else {
			Nominee_Details nominee_detail = nomineeRepository.save(nominee_details);
		}
        Optional<Nominee_Details> nominee = nomineeRepository.findById(nomineee_id);
        if(nominee != null){
		}
		return nominee_details;
    }


}
