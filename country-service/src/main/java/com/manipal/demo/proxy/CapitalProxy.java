package com.manipal.demo.proxy;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.demo.model.CapitalModel;

//@FeignClient(name = "capital-service", url = "localhost:8000")
@FeignClient(name="capital-service")
@RibbonClient(name="capital-service")

public interface CapitalProxy {
	@GetMapping("/capital-service/code/{code}")
	public CapitalModel getCapital(@PathVariable String code );
}


