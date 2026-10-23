package Task4_5;

public class LogisticsConfig {
    /*- 创建一个 LogisticsConfig 类，内部包含一个属性 private String systemName = "顺风智能仓储系统"。
- 核心步骤：私有化无参构造器（防止外部 new 对象）；在类内部创建一个静态的私有实例；提供一个 public static LogisticsConfig getInstance() 方法返回该实例。
- 在 main 方法中获取两个实例，并使用 == 比较它们是否为同一个内存地址。*/

        // 属性
        private String systemName = "顺风智能仓储系统";


        private LogisticsConfig() {
        }

        // 2. 类内部创建静态私有实例
        private static final LogisticsConfig INSTANCE = new LogisticsConfig();

        // 3. 对外提供全局访问点
        public static LogisticsConfig getInstance() {
            return INSTANCE;
        }


    }