package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent871
    implements PrybarComponent {

  private RootComponent871 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent871.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent871.class, "root"));
  }

  public RootComponent871 getRoot() {
    return root;
  }

}
