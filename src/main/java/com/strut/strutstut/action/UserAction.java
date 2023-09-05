package com.strut.strutstut.action;

import com.strut.strutstut.models.User;
import com.strut.strutstut.dao.UserDAO;
import com.strut.strutstut.form.UserForm;
import com.strut.strutstut.services.UserService;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class UserAction extends MappingDispatchAction {

    private final UserService userService = new UserService();
    public ActionForward create(ActionMapping mapping, ActionForm form,
                                HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        UserForm userForm = (UserForm) form;
        User user = new User();
        user.setName(userForm.getName());
        user.setAge(userForm.getAge());
        List<User> listUser = userService.saveAndReadAll(user);
        userForm.setList(listUser);
        return mapping.findForward("user1");
    }

    public ActionForward addUser(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {
        return mapping.findForward("addUser");
    }

    public ActionForward viewUser(ActionMapping mapping, ActionForm form,
                                  HttpServletRequest request, HttpServletResponse response) throws Exception{
            List<User> listUser = userService.readAll();
            UserForm userForm = (UserForm) form;
            userForm.setList(listUser);
            return mapping.findForward("listUsers");
    }

    public ActionForward deteteUser(ActionMapping mapping, ActionForm form,
                                    HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer userID = Integer.parseInt(request.getParameter("id"));
        userService.deleteUserById(userID);

        return mapping.findForward("delete");
    }
}
