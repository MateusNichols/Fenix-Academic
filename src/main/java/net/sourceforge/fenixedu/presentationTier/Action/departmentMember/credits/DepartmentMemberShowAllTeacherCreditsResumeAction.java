package net.sourceforge.fenixedu.presentationTier.Action.departmentMember.credits;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sourceforge.fenixedu.domain.Teacher;
import net.sourceforge.fenixedu.presentationTier.Action.credits.ShowAllTeacherCreditsResumeAction;
import net.sourceforge.fenixedu.presentationTier.Action.credits.departmentMember.DepartmentMemberViewTeacherCreditsDA;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.fenixedu.bennu.core.domain.User;
import org.fenixedu.bennu.core.security.Authenticate;

import pt.ist.fenixWebFramework.struts.annotations.Forward;
import pt.ist.fenixWebFramework.struts.annotations.Forwards;
import pt.ist.fenixWebFramework.struts.annotations.Mapping;

@Mapping(module = "departmentMember", path = "/showAllTeacherCreditsResume",
        functionality = DepartmentMemberViewTeacherCreditsDA.class)
@Forwards(
        value = { @Forward(name = "show-all-credits-resume", path = "/departmentMember/credits/listAllTeacherCreditsResume.jsp") })
public class DepartmentMemberShowAllTeacherCreditsResumeAction extends ShowAllTeacherCreditsResumeAction {

    public ActionForward showTeacherCreditsResume(ActionMapping mapping, ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        User userView = Authenticate.getUser();
        Teacher teacher = userView.getPerson().getTeacher();
        readAllTeacherCredits(request, teacher);
        return mapping.findForward("show-all-credits-resume");
    }
}
