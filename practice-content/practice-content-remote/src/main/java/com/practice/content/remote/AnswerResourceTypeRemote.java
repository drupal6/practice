package com.practice.content.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.content.hystrix.AnswerResourceTypeFallbackHystrix;
import com.practice.result.Result;

@Component
@FeignClient(value="practice-content-service", fallback=AnswerResourceTypeFallbackHystrix.class)
public interface AnswerResourceTypeRemote {

	@RequestMapping("/answerResourceType/list")
	public Result<?> getAnswerResourceTypeList();
}
