package kom.symber.koronavajrus.controllers;

import kom.symber.koronavajrus.models.LocationStats;
import kom.symber.koronavajrus.services.CoronaVajrusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DecimalFormat;
import java.util.List;

@Controller
public class HomeController {
    private static DecimalFormat df = new DecimalFormat("0.000");
    @Autowired
    CoronaVajrusDataService coronaVajrusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVajrusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalReportedCases);

        return "home";
    }

}
