package e_Proxy;


interface ClothFactory {
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory {
    private ClothFactory factory;
    @Override
    public void produceCloth() {
        System.out.println("代理工厂做准备工作");

        factory.produceCloth();

        System.out.println("代理工厂做一些后续的收尾工作");
    }

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }
}

//被代理类
class NikeClothFactory implements ClothFactory {
    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}
public class a_StaticProxy {
    public static void main(String[] args) {
        NikeClothFactory nike = new NikeClothFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);


        proxyClothFactory.produceCloth();
    }
}
