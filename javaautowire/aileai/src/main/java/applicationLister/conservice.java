package applicationLister;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class conservice implements Converter<String,Integer> {
    @Nullable
    @Override
    public Integer convert(String source) {


        return Integer.valueOf(source);
    }
}
