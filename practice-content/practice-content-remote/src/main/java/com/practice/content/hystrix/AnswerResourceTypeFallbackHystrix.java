package com.practice.content.hystrix;

import com.practice.content.remote.AnswerResourceTypeRemote;
import com.practice.result.Result;

public class AnswerResourceTypeFallbackHystrix implements AnswerResourceTypeRemote {

	@Override
	public Result<?> getAnswerResourceTypeList() {
		Result<?> result = new Result<>();
		result.setCode(404);
		result.setMessage("/answerResourceType/list is fail!");
		return result;
	}
}
