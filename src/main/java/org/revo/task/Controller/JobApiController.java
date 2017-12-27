package org.revo.task.Controller;

import org.revo.task.Domain.JobsEntity;
import org.revo.task.Repository.JobsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/jobs")
public class JobApiController {
    @Autowired
    public JobsEntityRepository jobsEntityRepository;

    @PostMapping
    public void save(@RequestBody JobsEntity jobsEntity) {
        jobsEntityRepository.save(jobsEntity);
    }

    @GetMapping("{id}")
    public JobsEntity get(@PathVariable String id) {
        return jobsEntityRepository.findOne(id);
    }

    @GetMapping("list")
    public List<JobsEntity> list() {
        return jobsEntityRepository.findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        jobsEntityRepository.delete(id);
    }

    @PostMapping(value = "minimum", params = "minimum")
    public List<JobsEntity> minimum(@RequestParam("minimum") int minimum) {
        return jobsEntityRepository.findByMinSalaryGreaterThanEqualOrderByMaxSalaryDesc(minimum);
    }

    @PostMapping(value = "update/{id}")
    public void updateName(@PathVariable("id") String id, @RequestBody() JobsEntity jobsEntity) {
        JobsEntity one = jobsEntityRepository.findOne(id);
        one.setJobTitle(jobsEntity.getJobTitle());
        jobsEntityRepository.save(one);
    }
}
