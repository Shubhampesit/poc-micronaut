package valorx.optimization.poc.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valorx.optimization.poc.poc.dto.ViewDetail;
import valorx.optimization.poc.poc.repository.ViewsRepository;

@Service
public class ViewsService {

    @Autowired
    private ViewsRepository viewsRepository;

    public ViewDetail fetchViewDetails(int environmentId, int ownerId, int viewId) {

        return viewsRepository.getViewDetails(environmentId, ownerId, viewId);
    }
}
