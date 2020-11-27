package functions;


import static apitest.TestBase.saveDatas;

public class GetCodeFunction implements Function{
    @Override
    public String execute(String[] args) {
        //一个参数，放原字符串示例：（redirect_uri）
        String redirect_uri = saveDatas.get("redirect_uri");
        String code =redirect_uri.substring(redirect_uri.length()-32);

        return code;
    }

    @Override
    public String getReferenceKey() {
        return "getCode";
    }
}
