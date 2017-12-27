package org.revo.task;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.revo.task.Domain.JobsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaskApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;
    String id = "AC_ACCOUNT";

    @Test
    public void contextLoads() {
        JobsEntity request = new JobsEntity();
        request.setJobTitle("test title");
        restTemplate.postForObject("/api/jobs/update/"+id, request, Void.class);
        JobsEntity jobsEntity = restTemplate.getForObject("/api/jobs/" + id, JobsEntity.class);
        Assert.assertEquals(request.getJobTitle(), jobsEntity.getJobTitle());
    }

}
