public class Main {
    public static void main(String[] args) {
        Unit unit1 = new Unit(100,"qwerty");
        unit1.prInfo();

        Mage mage1 = new Mage(70,"wizard",100);
        mage1.prInfo();

        Mage mage2 = new Mage(unit1, 100);
        mage2.prInfo();

        Unit uni2 = new Unit(1000);
        uni2.prInfo();
    }

    // 4) Отлтчие класса от объекта?
    //
    // Класс от объекта отличается тем что класс может существовать без объекта, а объект
    // без класса нет. Можно сравнить с чертежом и деталью тоесть чертеж это будет класс, а сама деталь это объект
    // которая была создана по тем правилам, которые были указаны в черетеже
    //
    // 5) Описать 3 принципа ООП?
    //
    //  1. Инкапсуляция ( объедение данных и методов в единное целое. И его главной особенностью является защищеность от чужого вмешательства.
    //                    в пример можно привести механические часы то есть человеку не обязательно задумыватья как вращаються там шестеренки, а
    //                    достаточно смотреть на стрелки и определять время)
    //  2. Наследование ( можно сказать копирование переменных и методов из другого класса, но без возможности изменять эти методы )
    //  3. Полиморфизм  ( реализование какого-нибудь метода по разному. Можно привести пример с животныим у них будет один метод go(),
    //                    но каждое животное выполняет его своим способом птица-летит, рыба-плывет, лошадь-бежит и т.д )
    //
    // 6) Модификаторы доступа
    //
    //   public - открытый, делает видимым для всех других классов
    //   private - закрытый, дает видимость только объектам определенного класса
    //   protected - тот же самый что и private, но и наследникам тоже открывается доступ
    //   default - на подобии public, но видим только для тех объектов, которые в одном пакете
    //
}