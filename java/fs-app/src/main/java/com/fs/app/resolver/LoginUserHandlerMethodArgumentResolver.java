package com.fs.app.resolver;


/**
 * @LoginUser注解的方法参数，注入当前登录用户
 */
//@Component
//public class LoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
//    @Autowired
//    private UserService userService;
//
//    @Override
//    public boolean supportsParameter(MethodParameter parameter) {
//        return parameter.getParameterType().isAssignableFrom(UserEntity.class) && parameter.hasParameterAnnotation(LoginUser.class);
//    }
//
//    @Override
//    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container,
//                                  NativeWebRequest request, WebDataBinderFactory factory) throws Exception {
//        //获取用户ID
//        Object object = request.getAttribute(AuthorizationInterceptor.USER_KEY, RequestAttributes.SCOPE_REQUEST);
//        if(object == null){
//            return null;
//        }
//
//        //获取用户信息
//        UserEntity user = userService.getById((Long)object);
//
//        return user;
//    }
//}
