package com.tr.danismend.ebel.web.cli;

import com.tr.nebula.security.api.domain.PermissionType;
import com.tr.nebula.security.db.domain.Menu;
import com.tr.nebula.security.db.domain.Permission;
import com.tr.nebula.security.db.domain.Role;
import com.tr.nebula.security.db.domain.User;
import com.tr.nebula.security.db.repository.NebulaMenuRepository;
import com.tr.nebula.security.db.repository.NebulaPermissionRepository;
import com.tr.nebula.security.db.repository.NebulaRoleRepository;
import com.tr.nebula.security.db.repository.NebulaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Mustafa Erbin on 03/03/2017.
 */
@Component
public class InitialCommand {

    @Autowired
    private NebulaUserRepository robeUserRepository;

    @Autowired
    private NebulaRoleRepository robeRoleRepository;

    @Autowired
    private NebulaMenuRepository robeMenuRepository;

    @Autowired
    private NebulaPermissionRepository permissionRepository;

    public void run() {

        Role roleGroup = new Role();
        roleGroup.setName("Admin");
        roleGroup.setCode("ADMIN");
        robeRoleRepository.save(roleGroup);

        User user = new User();
        user.setUsername("admin");
        user.setPassword("96cae35ce8a9b0244178bf28e4966c2ce1b8385723a96a6b838858cdd6ca0a1e");
        user.setActive(true);
        user.setName("admin");
        user.setSurname("admin");
        user.setRole(roleGroup);

        robeUserRepository.save(user);

        Menu managerMenu = new Menu();
        managerMenu.setText("Manager");
        managerMenu.setPath("Manager");
        managerMenu.setModule("Manager");
        managerMenu.setIcon("fa-cogs");
        managerMenu.setIndex(1);

        robeMenuRepository.save(managerMenu);

        Menu userMenu = new Menu();
        userMenu.setText("Users");
        userMenu.setPath("manager/user/User");
        userMenu.setModule("User");
        userMenu.setIcon("fa-users");
        userMenu.setParent(managerMenu);
        userMenu.setIndex(1);

        robeMenuRepository.save(userMenu);

        Menu roleMenu = new Menu();
        roleMenu.setText("Role");
        roleMenu.setPath("manager/role/Role");
        roleMenu.setModule("Roles");
        roleMenu.setIcon("fa-file-text-o");
        roleMenu.setParent(managerMenu);
        roleMenu.setIndex(2);

        robeMenuRepository.save(roleMenu);

        Menu menuMenu = new Menu();
        menuMenu.setText("Menu");
        menuMenu.setPath("manager/menu/Menu");
        menuMenu.setModule("Menu");
        menuMenu.setIcon("fa-tasks");
        menuMenu.setParent(managerMenu);
        menuMenu.setIndex(3);

        robeMenuRepository.save(menuMenu);

        Menu permissionMenu = new Menu();
        permissionMenu.setText("Permissions");
        permissionMenu.setPath("manager/permission/Permission");
        permissionMenu.setModule("Permission");
        permissionMenu.setIcon("fa-cogs");
        permissionMenu.setParent(managerMenu);
        permissionMenu.setIndex(4);

        robeMenuRepository.save(permissionMenu);

        Menu siteMenu = new Menu();
        siteMenu.setText("Site");
        siteMenu.setPath("Site");
        siteMenu.setModule("Site");
        siteMenu.setIcon("fa-cogs");
        siteMenu.setIndex(2);

        robeMenuRepository.save(siteMenu);

        Menu todoMenu = new Menu();
        todoMenu.setText("Todo");
        todoMenu.setPath("app/Application");
        todoMenu.setModule("Todo");
        todoMenu.setIcon("fa-list-alt");
        todoMenu.setParent(siteMenu);
        todoMenu.setIndex(1);

        robeMenuRepository.save(todoMenu);

        Menu showcaseMenu = new Menu();
        showcaseMenu.setText("Showcase");
        showcaseMenu.setPath("app/Showcase");
        showcaseMenu.setModule("Showcase");
        showcaseMenu.setIcon("fa-rebel");
        showcaseMenu.setParent(siteMenu);
        showcaseMenu.setIndex(2);

        robeMenuRepository.save(showcaseMenu);

        /**
         * add manager module permission to admin role
         */
        Permission permissionManager = new Permission();
        permissionManager.setPermissionType(PermissionType.MENU);
        permissionManager.setMenu(managerMenu);
        permissionManager.setRole(roleGroup);

        permissionRepository.save(permissionManager);

        Permission permissionUser = new Permission();
        permissionUser.setPermissionType(PermissionType.MENU);
        permissionUser.setMenu(userMenu);
        permissionUser.setRole(roleGroup);

        permissionRepository.save(permissionUser);

        Permission permissionRole = new Permission();
        permissionRole.setPermissionType(PermissionType.MENU);
        permissionRole.setMenu(roleMenu);
        permissionRole.setRole(roleGroup);

        permissionRepository.save(permissionRole);

        Permission permissionMenuView = new Permission();
        permissionMenuView.setPermissionType(PermissionType.MENU);
        permissionMenuView.setMenu(menuMenu);
        permissionMenuView.setRole(roleGroup);

        permissionRepository.save(permissionMenuView);

        Permission permissionPermissionView = new Permission();
        permissionPermissionView.setPermissionType(PermissionType.MENU);
        permissionPermissionView.setMenu(permissionMenu);
        permissionPermissionView.setRole(roleGroup);

        permissionRepository.save(permissionPermissionView);

        Permission permissionSite = new Permission();
        permissionSite.setPermissionType(PermissionType.MENU);
        permissionSite.setMenu(siteMenu);
        permissionSite.setRole(roleGroup);

        permissionRepository.save(permissionSite);

        Permission permissionTodoMenu = new Permission();
        permissionTodoMenu.setPermissionType(PermissionType.MENU);
        permissionTodoMenu.setMenu(todoMenu);
        permissionTodoMenu.setRole(roleGroup);

        permissionRepository.save(permissionTodoMenu);

        Permission permissionShowCaseMenu = new Permission();
        permissionShowCaseMenu.setPermissionType(PermissionType.MENU);
        permissionShowCaseMenu.setMenu(showcaseMenu);
        permissionShowCaseMenu.setRole(roleGroup);

        permissionRepository.save(permissionShowCaseMenu);

        Permission rolePermission = new Permission();
        rolePermission.setPermissionGroup("rolePermission");
        rolePermission.setRole(roleGroup);
        rolePermission.setPermissionType(PermissionType.REST);

        permissionRepository.save(rolePermission);

        Permission menuPermission = new Permission();
        menuPermission.setPermissionGroup("menuPermission");
        menuPermission.setRole(roleGroup);
        menuPermission.setPermissionType(PermissionType.REST);

        permissionRepository.save(menuPermission);

        Permission userPermission = new Permission();
        userPermission.setPermissionGroup("userPermission");
        userPermission.setRole(roleGroup);
        userPermission.setPermissionType(PermissionType.REST);

        permissionRepository.save(userPermission);

        Permission permissionController = new Permission();
        permissionController.setPermissionGroup("permissionController");
        permissionController.setRole(roleGroup);
        permissionController.setPermissionType(PermissionType.REST);

        permissionRepository.save(permissionController);

    }
}
