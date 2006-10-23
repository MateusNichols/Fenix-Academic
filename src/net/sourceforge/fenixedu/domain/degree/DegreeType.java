/*
 * DegreeType.java
 *
 * Created on 20 de Dezembro de 2002, 14:12
 */

package net.sourceforge.fenixedu.domain.degree;

import java.util.ResourceBundle;

import net.sourceforge.fenixedu.domain.GradeScale;
import net.sourceforge.fenixedu.domain.curricularPeriod.CurricularPeriodType;
import net.sourceforge.fenixedu.util.LanguageUtils;

/**
 * 
 * @author Nuno Nunes & Joana Mota
 */
public enum DegreeType {

    DEGREE(GradeScale.TYPE20, null, 5, 0, false, false, false),

    MASTER_DEGREE(GradeScale.TYPE5, null, 2, 0, false, false, true),

    BOLONHA_DEGREE(null, CurricularPeriodType.THREE_YEAR, 3, 180, true, true, false),

    BOLONHA_MASTER_DEGREE(null, CurricularPeriodType.TWO_YEAR, 2, 120, true, true, false),

    BOLONHA_INTEGRATED_MASTER_DEGREE(null, CurricularPeriodType.FIVE_YEAR, 5, 300, true, true, false),

    BOLONHA_PHD_PROGRAM(null, CurricularPeriodType.YEAR, 1, 30, true, true, true),

    BOLONHA_ADVANCED_FORMATION_DIPLOMA(null, CurricularPeriodType.YEAR, 1, 30, true, true, true),

    BOLONHA_SPECIALIZATION_DEGREE(null, CurricularPeriodType.YEAR, 1, 30, true, true, true);

    private GradeScale gradeScale;

    private CurricularPeriodType curricularPeriodType;

    private int years;

    private double defaultEctsCredits;

    private boolean bolonhaType;

    private boolean canCreateStudent;

    private boolean canCreateStudentOnlyWithCandidacy;

    private DegreeType(GradeScale gradeScale, CurricularPeriodType curricularPeriodType, int years,
	    double defaultEctsCredits, boolean bolonhaType, boolean canCreateStudent,
	    boolean canCreateStudentOnlyWithCandidacy) {
	this.gradeScale = gradeScale;
	this.curricularPeriodType = curricularPeriodType;
	this.years = years;
	this.defaultEctsCredits = defaultEctsCredits;
	this.bolonhaType = bolonhaType;
	this.canCreateStudent = canCreateStudent;
	this.canCreateStudentOnlyWithCandidacy = canCreateStudentOnlyWithCandidacy;
    }

    public String getName() {
	return name();
    }

    public GradeScale getGradeScale() {
	return this.gradeScale;
    }

    public CurricularPeriodType getCurricularPeriodType() {
	return curricularPeriodType;
    }

    public int getYears() {
	return this.years;
    }

    public double getDefaultEctsCredits() {
	return defaultEctsCredits;
    }

    public boolean isBolonhaType() {
	return bolonhaType;
    }

    public boolean canCreateStudent() {
	return canCreateStudent;
    }

    public boolean canCreateStudentOnlyWithCandidacy() {
	return canCreateStudentOnlyWithCandidacy;
    }

    public String getLocalizedName() {
	return ResourceBundle.getBundle("resources.EnumerationResources", LanguageUtils.getLocale())
		.getString(name());
    }

}