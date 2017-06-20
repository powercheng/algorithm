Collection interface

boolean	add(E e)
boolean	addAll(Collection<? extends E> c)
void	clear()
boolean	contains(Object o)
boolean	containsAll(Collection<?> c)
boolean	equals(Object o)
int	hashCode()
boolean	isEmpty()
Iterator<E>	iterator()
boolean	remove(Object o)
boolean	removeAll(Collection<?> c)
boolean	retainAll(Collection<?> c)
int	size()
Object[]	toArray()
<T> T[]	toArray(T[] a)

List interface

void	add(int index, E element)
boolean	addAll(int index, Collection<? extends E> c)
E	get(int index)
int	indexOf(Object o)
int	lastIndexOf(Object o)
E	remove(int index)
E	set(int index, E element)
List<E>	subList(int fromIndex, int toIndex)

LinkedList

addFirst()	addLast()
removeFirst()		removeLast()
peekFirst()		peekLast()

Deque<Integer> stack = new ArrayDeque<Integer>();
