package application.lab3.controller.UIActions;

import application.lab3.model.DepartmentDataOperations;

import javax.servlet.http.HttpServletRequest;


public class NewDepartment implements Action {

    public String execute(HttpServletRequest req) {
        DepartmentDataOperations.insertDept(req);
        return "/jsp/edit.jsp";
    }
}
