package io.ckbox.springexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CKBoxExampleWebpageController {
	@Value("${ckeditor_license_key}")
	private String licenseKey;

	@GetMapping("/ckbox-example-ckeditor")
	public String ckeditorExample(Model model) {
		model.addAttribute("licenseKey", this.licenseKey);

		return "ckbox-example-ckeditor";
	}

	@GetMapping("/ckbox-example-modal")
	public String modalExample(Model model) {
		return "ckbox-example-modal";
	}

	@GetMapping("/ckbox-example-full-page")
	public String fullPageExample(Model model) {
		return "ckbox-example-full-page";
	}
}
