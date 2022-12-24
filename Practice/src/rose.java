import person.flower;

public class rose {
    public static void main(String[] args) {
        flower rose=new flower("玫瑰花",
                "成分: 含有少量挥发油和黄色结晶性煎、揉质、没食子酸、色素等。玫瑰油中主要成分为醇类化合物。",
                "药用价值:行气解郁，和血，止痛。用于肝胃气痛，食少呕恶，月经不调，跌扑伤痛。",
                "用法:泡茶，煎汤，或浸酒、熬膏服。");
        System.out.println(rose.name);
        System.out.println(rose.variety);
        System.out.println(rose.function);
        System.out.println(rose.ways);
        System.out.println();

        flower dandelion=new flower("蒲公英",
                "成分: 含蒲公英甾醇、胆碱、菊糖、果胶、蒲公英固醇、蒲公英素、蒲公英赛醇、咖啡酸等。",
                "清热解毒，消肿散结，利尿通淋。用于疔疮肿毒，乳痈，瘰疠，目赤，咽痛，肺痈，肠痈，湿热黄疸，热淋涩痛。",
                "用法：生吃、炒食、做汤、炝拌、 泡茶，煎汤。");
        System.out.println(dandelion.name);
        System.out.println(dandelion.variety);
        System.out.println(dandelion.function);
        System.out.println(dandelion.ways);
        System.out.println();


    }
}
