package com.training.controller;

<<<<<<< HEAD
import java.net.Authenticator.RequestorType;
import java.util.List;
import com.training.helper.FactoryAdminDAO;
import com.training.model.AttendeesAdminModel;
import com.training.model.ScheduleAdminModel;
import com.training.model.VenueAdminModel;
import com.training.service.AdminService;
import com.training.service.AdminServiceImpl;
import com.training.view.AdminView;
import com.training.view.UpdateAdminModel;

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
public class AdminController {
<<<<<<< HEAD
	private AdminService adminService;
	AdminView employeeView=new AdminView();
	
	public AdminController() {
		this.adminService=
				FactoryAdminDAO.createAdminService();
	}

		
  public void numberOfAttendees(AttendeesAdminModel adminModel)
  {
	  
	  AdminService adminService = new AdminServiceImpl();
	  adminService.attendeesService(adminModel);
		
  }
	
	public void venueController(VenueAdminModel venueAdminModel)
	{
		AdminService adminService = new AdminServiceImpl();
		adminService.venueService(venueAdminModel);
		
	}
	
	public void updateDateController(ScheduleAdminModel scheduleAdminModel)
	{
		AdminService adminService = new AdminServiceImpl(); {
		 adminService.updateDateService(scheduleAdminModel);	
		}
	}
=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
}
