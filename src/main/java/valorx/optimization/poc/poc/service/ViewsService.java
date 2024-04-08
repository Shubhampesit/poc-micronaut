package valorx.optimization.poc.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import valorx.optimization.poc.poc.entity.Views;
import valorx.optimization.poc.poc.repository.ViewsRepository;

import java.util.List;

@Service
public class ViewsService {

    @Autowired
    private ViewsRepository viewsRepository;

    public List<Views> fetchViewDetails(int environmentId, int ownerId, int viewId) {
        PageRequest pageRequest = PageRequest.of(0, 2);
        return viewsRepository.findAll(pageRequest).getContent();
    }
}
