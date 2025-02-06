package controller;

import com.example.demo.delegate.RandomDataGenerator;
import com.example.demo.model.ProcessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private RandomDataGenerator randomDataGenerator;

    @PostMapping("/start")
    public Map<String, Object> startProcess(@RequestParam int postValue) {
        // Генерация случайного числа
        int randomData = randomDataGenerator.generateRandomData();

        // Определение результата
        String taskResult = (postValue + randomData >= 100) ? "A" : "B";
        int total = postValue + randomData;

        // Создание результата процесса
        ProcessResult result = new ProcessResult(postValue, randomData, total, taskResult);

        // Возвращаем результат в ответе
        Map<String, Object> response = new HashMap<>();
        response.put("result", result);
        return response;
    }

    @GetMapping("/result")
    public ProcessResult getResult(@RequestParam int postValue, @RequestParam int randomData) {
        int total = postValue + randomData;
        String taskResult = (total >= 100) ? "A" : "B";

        return new ProcessResult(postValue, randomData, total, taskResult);
    }
}
