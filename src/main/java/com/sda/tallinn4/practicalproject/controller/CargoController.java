package com.sda.tallinn4.practicalproject.controller;

import com.sda.tallinn4.practicalproject.model.Cargo;
import com.sda.tallinn4.practicalproject.repository.CargoRepository;
import com.sda.tallinn4.practicalproject.service.CargoService;
import com.sda.tallinn4.practicalproject.service.UserService;
import com.sda.tallinn4.practicalproject.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CargoController {

    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private CargoService cargoService;

    @Autowired
    private UserService userService;

/*    @GetMapping(path = "cargo/all")
    public Iterable<Cargo> findAll (){
        return cargoService.findAll();
    }*/

    @GetMapping(path = "cargo")
    public ModelAndView findAllCargo() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/cargo");
        modelAndView.addObject("cargo", cargoService.findAll());
        return modelAndView;
    }

    @GetMapping(path = "cargo/findBySearchCriteria")
    public ModelAndView findBySearchCriteria(@RequestParam String name,@RequestParam String criteria){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/findCargoByCriteria");
        modelAndView.addObject("cargo",
            cargoService.findAllBySearchCriteria(name, criteria));
        return modelAndView;
    }


    @GetMapping(path = "cargo/findByLoadingPlace")
    public Iterable<Cargo> findAllByLoadingPlace (@RequestParam("loadingPlace") String name){
        return cargoService.findAllByLoadingPlace(name);
    }

    @GetMapping(path = "cargo/findByDischargingPlace")
    public Iterable<Cargo> findAllByDischargingPlace (@RequestParam("dischargingPlace") String name){
        return cargoService.findAllByDischargingPlace(name);
    }

    @GetMapping(path = "cargo/findAllByCargoDescription/")
    public Iterable<Cargo> findAllByCargoDescription (@RequestParam("cargoDescription") String name){
        return cargoService.findAllByCargoDescription(name);
    }

    @GetMapping(path = "/cargo/add")
    public String get(Model model){
        Cargo cargo = new Cargo();
        cargo.setUser(UserUtil.getLoggedInUser(userService));
        model.addAttribute("cargo", cargo);
        return "html/addcargo";
    }

    @PostMapping(path = "/cargo/add")
    public String addNewCargo(Model model, @ModelAttribute("cargo") Cargo cargo){
        cargoService.addNewCargo(cargo);
        return "html/addcargo";
    }

    @GetMapping(path = "/cargo/delete/{id}")
    public ModelAndView deleteCargo(@PathVariable("id") Long id){
    cargoService.deleteById(id);
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("adminCargo");
    modelAndView.addObject("cargo", cargoService.findAll());
    return modelAndView;
    }

    @DeleteMapping(path = "/cargo/delete")
    public void deleteCargo (@ModelAttribute("cargo") Cargo cargo){
        cargoService.deleteCargo(cargo);
    }

}
/*    @GetMapping("/admin/categories/delete/{id}")
    public ModelAndView deleteCategory(@PathVariable("id") Long id) {
        categoryService.deleteById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminCategories");
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }*/
