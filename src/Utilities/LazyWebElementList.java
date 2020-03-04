package Utilities;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class LazyWebElementList implements List<WebElement> {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final By by;
    private List<WebElement> elements;

    public LazyWebElementList(WebDriver driver, By by, WebDriverWait wait) {
        this.driver = driver;
        this.by = by;
        this.wait = wait;
    }

    private List<WebElement> getElements() {
        if (elements == null) {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            elements = driver.findElements(by);
        }

        return elements;
    }

    public int size() {
        return getElements().size();
    }

    public boolean isEmpty() {
        return getElements().isEmpty();
    }

    public boolean contains(Object o) {
        return getElements().contains(o);
    }

    @NotNull
    public Iterator<WebElement> iterator() {
        return getElements().iterator();
    }

    public void forEach(Consumer<? super WebElement> action) {
        getElements().forEach(action);
    }

    @NotNull
    public Object[] toArray() {
        return getElements().toArray();
    }

    @NotNull
    public <T> T[] toArray(@NotNull T[] a) {
        return getElements().toArray(a);
    }

    public <T> T[] toArray(IntFunction<T[]> generator) {
        return getElements().toArray(generator);
    }

    public boolean add(WebElement element) {
        return getElements().add(element);
    }

    public boolean remove(Object o) {
        return getElements().remove(o);
    }

    public boolean containsAll(@NotNull Collection<?> c) {
        return getElements().containsAll(c);
    }

    public boolean addAll(@NotNull Collection<? extends WebElement> c) {
        return getElements().addAll(c);
    }

    public boolean addAll(int index, @NotNull Collection<? extends WebElement> c) {
        return getElements().addAll(index, c);
    }

    public boolean removeAll(@NotNull Collection<?> c) {
        return getElements().removeAll(c);
    }

    public boolean removeIf(Predicate<? super WebElement> filter) {
        return getElements().removeIf(filter);
    }

    public boolean retainAll(@NotNull Collection<?> c) {
        return getElements().retainAll(c);
    }

    public void replaceAll(UnaryOperator<WebElement> operator) {
        getElements().replaceAll(operator);
    }

    public void sort(Comparator<? super WebElement> c) {
        getElements().sort(c);
    }

    public void clear() {
        getElements().clear();
    }

    public WebElement get(int index) {
        return getElements().get(index);
    }

    public WebElement set(int index, WebElement element) {
        return getElements().set(index, element);
    }

    public void add(int index, WebElement element) {
        getElements().add(index, element);
    }

    public WebElement remove(int index) {
        return getElements().remove(index);
    }

    public int indexOf(Object o) {
        return getElements().indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return getElements().lastIndexOf(o);
    }

    @NotNull
    public ListIterator<WebElement> listIterator() {
        return getElements().listIterator();
    }

    @NotNull
    public ListIterator<WebElement> listIterator(int index) {
        return getElements().listIterator(index);
    }

    @NotNull
    public List<WebElement> subList(int fromIndex, int toIndex) {
        return getElements().subList(fromIndex, toIndex);
    }

    public Spliterator<WebElement> spliterator() {
        return getElements().spliterator();
    }

    public Stream<WebElement> stream() {
        return getElements().stream();
    }

    public Stream<WebElement> parallelStream() {
        return getElements().parallelStream();
    }
}
