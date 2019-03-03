package fr.kungfunantes.backend.model.rank.criteria;

import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class RankCriteriaResource {

	@Autowired
	private RankCriteriaRepository rankCriteriaRepository;

    @PostMapping("/rank-criterion")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public RankCriteria create(@RequestBody RankCriteria rankCriteria) {
        return Preconditions.checkNotNull(rankCriteriaRepository.save(rankCriteria));
    }
 
    @DeleteMapping("/rank-criterion/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        rankCriteriaRepository.deleteById(id);
    }
}