package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent745
    implements PrybarComponent {

  private RootComponent745 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent745.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent745.class, "root"));
  }

  public RootComponent745 getRoot() {
    return root;
  }

}
