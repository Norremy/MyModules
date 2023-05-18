package sg.edu.rp.c346.id22030544.mymodules;

import java.util.ArrayList;

public class Module {
    private String moduleCode;
    private String moduleName;
    private int academicYear;
    private int semester;
    private int moduleCredit;
    private String venue;
    private String display;

    public Module(String moduleCode, String moduleName, int academicYear, int semester, int moduleCredit, String venue) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.academicYear = academicYear;
        this.semester = semester;
        this.moduleCredit = moduleCredit;
        this.venue = venue;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public int getSemester() {
        return semester;
    }

    public int getModuleCredit() {
        return moduleCredit;
    }

    public String getVenue() {
        return venue;
    }


}
//    ArrayList<String> template = new ArrayList<String>();
//        template.add("Module Code: ");
//                template.add("Module Name: ");
//                template.add("Academic Year: ");
//                template.add("Semester: ");
//                template.add("Module Credit: ");
//                template.add("Venue: ");