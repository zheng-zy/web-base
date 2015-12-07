package sy.controller.aop;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sy.annotation.base.MethodName;
import sy.controller.base.BaseController;
import sy.model.aop.ControllerLog;
import sy.pageModel.base.JsonResult;
import sy.pageModel.base.PageResult;
import sy.service.base.BaseService;
import sy.util.base.QueryFilter;

/**
 * ControllerLog控制器
 *
 * http://git.oschina.net/sphsyv/sypro
 *
 * 由代码生成器生成
 * 
 * @author 孙宇
 *
 */
@Controller
@RequestMapping("/controllerLogController")
public class ControllerLogController extends BaseController<ControllerLog, Long> {

	@Resource(name = "controllerLogService")
	@Override
	public void setService(BaseService<ControllerLog, Long> service) {
		super.service = service;
	}

	@MethodName(name = "保存")
	@RequestMapping("/save")
	@ResponseBody
	public JsonResult save(ControllerLog controllerLog) {
		return super.save(controllerLog);
	}

	@MethodName(name = "删除")
	@RequestMapping("/delete")
	@ResponseBody
	public JsonResult delete(Long id, HttpServletRequest request) {
		QueryFilter filter = new QueryFilter(request);
		if (id != null) {
			filter.addFilter("Q_t.id_=_Long", "" + id);
		}
		return super.delete(filter);
	}

	@MethodName(name = "更新")
	@RequestMapping("/update")
	@ResponseBody
	public JsonResult update(ControllerLog controllerLog) {
		return super.update(controllerLog);
	}

	@MethodName(name = "查找一个")
	@RequestMapping("/get")
	@ResponseBody
	public JsonResult get(Long id, HttpServletRequest request) {
		QueryFilter filter = new QueryFilter(request);
		if (id != null) {
			filter.addFilter("Q_t.id_=_Long", "" + id);
		}
		return super.get(filter);
	}

	@MethodName(name = "查找一批")
	@RequestMapping("/find")
	@ResponseBody
	public PageResult find(HttpServletRequest request) {
		QueryFilter filter = new QueryFilter(request);
		return super.find(filter);
	}

}
