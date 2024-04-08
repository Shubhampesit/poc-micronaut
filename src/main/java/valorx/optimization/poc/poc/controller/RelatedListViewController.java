package valorx.optimization.poc.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import valorx.optimization.poc.poc.dto.ViewDetail;
import valorx.optimization.poc.poc.entity.Views;
import valorx.optimization.poc.poc.service.ViewsService;

import java.util.List;

@RestController
@RequestMapping("/api/valorx")
public class RelatedListViewController {

    @Autowired
    private ViewsService viewsService;

    @GetMapping("view/owned/detail")
    public ResponseEntity<List<Views>> getViewDetail(@RequestParam(value = "view_id", required = false) int viewId) {

        //environmentId, viewId, ownerId
        int environmentId = 0;
        int ownerId = 0;

        List<Views> viewDetail = viewsService.fetchViewDetails(environmentId, ownerId, viewId);

        return ResponseEntity.ok(viewDetail);
    }

    @GetMapping("view/owned/list")
    public ResponseEntity<ViewDetail> getViewOwner(@RequestParam(value = "object_id", required = false) String object_id) {
        return ResponseEntity.ok(null);
    }
}
