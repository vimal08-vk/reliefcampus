package com.example.reliefcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String index() {
        return "dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/camps")
    public String camps() {
        return "camps";
    }

    @GetMapping("/supplies")
    public String supplies() {
        return "supplies";
    }

    @GetMapping("/families")
    public String families() {
        return "families";
    }

    @GetMapping({"/inventory", "/inventory-view"})
    public String inventoryView() {
        return "inventory";
    }

    @GetMapping({"/distributions", "/distributions-view"})
    public String distributionsView() {
        return "distributions";
    }

    @GetMapping("/reports")
    public String reports() {
        return "reports";
    }
}
