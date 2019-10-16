package com.training.service;

import java.util.List;
import com.training.model.AttendeesAdminModel;
import com.training.model.ScheduleAdminModel;
import com.training.model.TraineeModel;
import com.training.model.VenueAdminModel;

public interface AdminService {
    
	
	//public List<AdminModel> retrieveAdmin();
		// TODO Auto-generated method stub

	//boolean adminAuthenticationService(AdminModel adminModel);
	public boolean attendeesService(AttendeesAdminModel adminModel);
	public boolean venueService(VenueAdminModel venueAdminModel);
	public boolean updateDateService(ScheduleAdminModel scheduleAdminModel);
	
	
		
	
	

}

	
